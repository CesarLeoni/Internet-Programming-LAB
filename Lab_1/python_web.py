from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return ('Hello World! This is the index of a '
            'Flask app')

@app.route('/a')
def hello_a():
    return ('du-te ba de aici a - this is the'
            'surprise of finding out how flask'
            'with python works')

@app.route('/<name>')
def hello_name(name):
    return 'Hello %s!' % name

from flask import render_template
@app.route('/hello/<string:cv>/')
def hello(cv):
    return render_template('test.html', name=cv)

if __name__ == '__main__':
    app.run()