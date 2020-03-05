pipeline {
    agent any
    stages {

            stage('clean'){
                echo env
                bat 'mvn clean'
            }
            stage('Build') {
                steps {
                    echo 'Building..'
                    bat 'mvn compile'
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
                    bat 'mvn test'
                }
            }
            stage('install'){
                echo 'install'
                bat 'mvn install'
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
}