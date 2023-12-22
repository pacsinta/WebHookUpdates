import yaml
from flask import Flask, request, Response

# Read configuration
with open("config.yaml", "r") as yamlfile:
    cfg = yaml.load(yamlfile, Loader=yaml.SafeLoader)


class WebhookUpdate:
    port = 8080
    host = "127.0.0.1"
    url = "/webhook"

    def validateConfig(self, cfgKey):
        if(cfgKey in cfg and cfg[cfgKey] != ""):
            return True
        else:
            return False

    def __init__(self, cfg=None):
        if(self.validateConfig("port")):
            self.port = cfg["port"]
            print("port: " + str(self.port))

        if(self.validateConfig("host")):
            self.host = cfg["host"]
            print("host: " + str(self.host))

        if(self.validateConfig("url")):
            self.url = cfg["url"]
            print("url: " + str(self.url))
        
        
webhooks = WebhookUpdate(cfg)
app = Flask(__name__)

@app.route(webhooks.url, methods=['POST'])
def respond():
    print(request.json);
    return Response(status=200)

if __name__ == '__main__':
    app.run(host=webhooks.host, port=webhooks.port)