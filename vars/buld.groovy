def call(){
    sh 'sudo docker build -t node ./simple-node/ | tags=$(cat /proc/sys/kernel/random/uuid)'
    }