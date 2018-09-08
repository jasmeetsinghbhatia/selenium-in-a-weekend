pipeline {
    agent none
    stages {
        stage('Maven Build') {
            steps {
                echo 'Hello, Maven. Start the build'
                sh 'mvn clean build'
            }
        }
        stage('Maven Test') {
            steps {
                echo 'Hello, TestNG. Start the tests'
                sh 'mvn test'
            }
        }
    }
}