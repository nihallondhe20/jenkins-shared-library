def call(){
    sh 'sudo docker build -t nodejs ./simple-node/ | tag=$(cat /proc/sys/kernel/random/uuid)'
    }