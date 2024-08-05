pipeline {
    agent any

    environment {
        // Define any environment variables if needed
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git credentialsId: '7bdc9e9a-8802-4a71-bae8-46d44cba7aaf', url: 'git@github.com:goklasbarimbing17/prollo-automation.git'
            }
        }

        stage('Build') {
            steps {
                // Use Maven to build the project
                script {
                    def mvnHome = tool 'M3' // Assumes Maven is installed and configured in Jenkins as "M3"
                    sh "${mvnHome}/bin/mvn clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                // Use Maven to run tests
                script {
                    def mvnHome = tool 'M3' // Assumes Maven is installed and configured in Jenkins as "M3"
                    sh "${mvnHome}/bin/mvn test"
                }
            }
        }

        stage('Post Test Actions') {
            steps {
                // Add any post-test actions here, like archiving test results
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Report'
                ])
            }
        }
    }

    post {
        always {
            // Clean workspace after build
            cleanWs()
        }
    }
}
