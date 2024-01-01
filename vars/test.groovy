def call(){
    sh "sudo docker tag javac:latest nihalsdocker/java:$version"
}   