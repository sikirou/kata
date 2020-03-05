pipeline {
    agent any
    stages {

            stage('clean'){

                steps {
                    echo 'cleaning'
                    bat 'mvn clean'
                }

            }
            stage('Build') {
                steps {
                    echo 'Building..'
                    bat 'mvn compile'
                }

            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                    bat 'mvn test'

                }
               post {
                  success {
                     junit 'target/surefire-reports/**/*.xml'
                  }
                }
            }
            stage('install'){
                steps{
                    echo 'install'
                    bat 'mvn install'
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                 }

            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
}