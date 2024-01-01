def tgdock(){
    sh 'sudo timestamp=$(date +%Y%m%d%H%M%S) |sudo  tag=$image:$timestamp | sudo docker tag node nihalsdocker/nodejs:$tag'
}