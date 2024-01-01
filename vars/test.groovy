def call(){
    sh ' sudo docker tag node:latest nihalsdocker/nodejs:$version'
}   