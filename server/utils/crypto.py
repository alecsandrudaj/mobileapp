import Crypto
from Crypto.PublicKey import RSA
from Crypto import Random
import ast
import os
import json
from .config import KEYS_DIR

class RSACipher:
    def __init__(self):
        pass

    def load_key(self, client_uuid):
        key_path = os.path.join(KEYS_DIR, client_uuid)
        if os.path.exists(key_path):
            with open(key_path, 'rb') as f:
                self.private_key = f.read()

    def _generate_keys(self, file_path):
        random_generator = Random.new().read
        key = RSA.generate(1024, random_generator)
