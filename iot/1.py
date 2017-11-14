from urllib2 import Request, urlopen, URLError
from picamera import PiCamera
from time import sleep
import datetime

time = datetime.datetime.now()

camera = PiCamera()

camera.start_preview()
sleep(5)
camera.capture('/home/pi/%s.jpg' % time)
camera.stop_preview()

data = '{"file" : "time"}'
#get
req = Request('http://127.0.0.1:8080', None, {'Content-Type' : 'application/json'})
#post
req = Request('http://127.0.0.1:8080', data, {'Content-Type' : 'application/json'})
res = urlopen(req)
print(res.read())
