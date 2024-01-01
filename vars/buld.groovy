def call(){
    sh "sudo docker build -t node /var/lib/jenkins/workspace/shared-libs/$FILENAME/"
    }