def call(){
    sh 'sudo docker build -t node ./simple-node/ | tag=$(cat /proc/sys/kernel/random/uuid)'
    }