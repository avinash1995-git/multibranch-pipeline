pipeline {

    agent any

    stages {
        stage('Test1') {
            steps {
                echo "this is my stage test1"
            }
        }

        stage('Test2') {
            steps {
                echo "this is my stage test2"
            }
        }
    }
}