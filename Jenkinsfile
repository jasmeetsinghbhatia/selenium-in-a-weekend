pipeline {
    agent none
    stages {
        stage('Maven Build') {
            steps {
                echo 'Hello, Maven. Start the build'
                mvn clean build
            }
        }
        stage('Maven Test') {
            steps {
                echo 'Hello, TestNG. Start the tests'
                mvn test
            }
        }
    }
}