#!python3

from flask import Flask, request, render_template

app = Flask(__name__)

@app.route('/gmp')
def welcome():
    return 'This is my first flask app.'

@app.route('/')
def rootpage():
    return render_template("index.html")

@app.route('/g')
def welcome2():
    return 'Nikal Laude!'

@app.route('/method', methods = ['GET','POST','PUT','DELETE'])
def method():
    if request.method == 'POST':
        return "You've used a POST request."
    else:
        return "You're probably using a GET request."
app.run()