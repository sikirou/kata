pipeline {
    agent any
    stages {

            stage('Build') {
                steps {
                    echo 'Building..'
                    bat 'mvn clean install'
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                }
                post {
                         success {
                            junit 'target/surefire-reports/**/*.xml'
                         }
                         }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
}