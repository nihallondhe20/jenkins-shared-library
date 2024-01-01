def tgdock(){
    sh 'timestamp=$(date +%Y%m%d%H%M%S) | tag=$image:$timestamp | sudo docker tag node nihalsdocker/nodejs:$tag'
}