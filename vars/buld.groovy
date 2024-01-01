def call(){
    sh "sudo docker build -t javac ./$FILENAME/"
    }