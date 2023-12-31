def call(){
    sh 'sudo apt install docker.io -y |sudo  docker run -itd -p node |sudo docker ps'
}