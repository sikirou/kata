pipeline {
    agent any
    stages {

            stage("clean"){

                steps {
                    echo "cleaning"
                     if (isUnix()) {
                        sh "mvn clean"
                     }else{
                        bat "mvn clean"
                     }
                }

            }
            stage("Build") {
                steps {
                    echo "Building.."
                    if(isUnix()){
                     sh "mvn compile"
                    }else {
                        bat "mvn compile"
                    }
                }


            }
            stage("Test") {
                steps {
                    echo "Testing.."
                    if(isUnix()){
                     sh "mvn test"
                    }else{
                         bat "mvn test"
                    }
                }
               post {
                  success {
                     junit "target/surefire-reports/**/*.xml"
                  }
                }
            }
            stage("install"){
                steps{
                    echo "install"
                     if(isUnix()){
                        sh "mvn install"
                     }else{
                        bat "mvn install"
                     }
                    archiveArtifacts artifacts: "**/target/*.jar", fingerprint: true
                 }

            }
            stage("Deploy") {
                steps {
                    echo "Deploying...."
                }
            }
        }
}