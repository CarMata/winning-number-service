pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/CarMata/winning-number-service.git', branch: 'main'
            }
        }

        stage('Build Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t winning-number-service:latest .'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply --validate=false -f deployment.yaml'
                sh 'kubectl apply --validate=false -f service.yaml'
            }
        }
    }
}
