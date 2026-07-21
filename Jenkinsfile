pipeline{
    agent any
    stages{
        stage('Install maven if missing'){
            steps{
                sh '''
                    if command -v mvn >/dev/null 2>&1; then
                        echo 'Maven este instalat'
                        mvn -version
                    else
                        echo "Maven nu exista, incercam instalarea:"
                        sudo apt-get install -y maven
                        mvn -version
                    fi
                '''
            }        
        }
        stage('Checkout'){
            steps{
                checkout scm
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
    }
    post{
        success{
            archiveArtifacts artifacts: 'target/**/*', fingerprint: true
        }
    }
}