pipeline {
    agent any

    environment {
        // Define environment variables
        MVN_HOME = tool 'M3' // Path to Maven installation in Jenkins
        JAVA_HOME = tool 'JDK11' // Path to JDK installation in Jenkins
        GIT_CREDENTIALS_ID = '7bdc9e9a-8802-4a71-bae8-46d44cba7aaf' // Your GitHub credentials ID
        TEST_ENV = 'staging' // Example of an environment variable
        API_URL = 'https://api.staging.example.com' // Example of an API URL variable
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git credentialsId: env.GIT_CREDENTIALS_ID, url: 'git@github.com:goklasbarimbing17/prollo-automation.git'
            }
        }

        stage('Build') {
            steps {
                // Use Maven to build the project
                script {
                    sh "${env.MVN_HOME}/bin/mvn clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                // Use Maven to run tests
                script {
                    sh "${env.MVN_HOME}/bin/mvn test"
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
