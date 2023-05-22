pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/nathanlepron/projet_ci_cd-main.git'
            }
        }
        
        stage('Build') {
            steps {
                
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                
                sh 'mvn deploy'
            }
        }
    }
}