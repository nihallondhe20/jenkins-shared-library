def call(){
    sh 'sudo docker build -t nodejs ./simple-node/ | sudo timestamp=$(date +%Y%m%d%H%M%S) |sudo  tag=$image:$timestamp'
}