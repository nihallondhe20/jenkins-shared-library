def call(){
    sh 'timestamp=$(date +%Y%m%d%H%M%S)sudo docker tag node:latest nihalsdocker/nodejs:$version'
}   