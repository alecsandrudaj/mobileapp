### thil file will handle database conections 

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