import os

SERVER_DIR = os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
KEYS_DIR = os.path.join(SERVER_DIR, '.keys')
MONGO_LINK = "mongodb://admin:2qPY5KhDlqBUbS3b@sapphronmongo-shard-00-00-ntfay.gcp.mongodb.net:27017,sapphronmongo-shard-00-01-ntfay.gcp.mongodb.net:27017,sapphronmongo-shard-00-02-ntfay.gcp.mongodb.net:27017/test?ssl=true&replicaSet=SapphronMongo-shard-0&authSource=admin&w=majority"