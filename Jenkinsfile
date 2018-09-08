pipeline {
    agent any
    tools {
        maven 'Maven 3.5.4'
        jdk 'jdk10'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn clean test -DtestngFile=testng.xml'
            }
            post {
                success {
                    testng 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}