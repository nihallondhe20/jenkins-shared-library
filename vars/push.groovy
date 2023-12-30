def call(){
    sh 'apt install docker.io -y | docker run -itd -p ubuntu'
}