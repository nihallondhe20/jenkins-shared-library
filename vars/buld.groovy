def call(){
    sh "[ -e './$FILENAME' ] || git clone https://github.com/nihallondhe20/simple-java.git | sudo docker build -t javac ./$FILENAME/"
    }