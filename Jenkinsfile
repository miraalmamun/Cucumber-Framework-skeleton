pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Get your source code from VCS
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Build your project and execute tests, generating a Cucumber JSON report
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Publish the Cucumber report
            cucumber jsonReportPath: 'target/cucumber-reports/cucumber.json',
                    trendsLimit: 10,
                    classifications: [
                        // You can add key-value pairs here for additional info in the report
                        // [key: 'Platform', value: 'YourPlatform'],
                        // [key: 'Browser', value: 'YourBrowser']
                           [key: 'Platform', value: env.TEST_PLATFORM],
                           [key: 'Browser', value: env.TEST_BROWSER]
                    ]
        }
    }
}
