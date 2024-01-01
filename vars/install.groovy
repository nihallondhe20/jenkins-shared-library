def call(){
    sh "[ -e './$FILENAME' ] || git clone https://github.com/nihallondhe20/simple-node.git"
}


