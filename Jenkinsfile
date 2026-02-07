pipeline{
    agent any

    environment {
        IMAGE = "spring-api"
        CONTAINER = "spring-api"
    }

    stages{
        stage('Build Jar'){
            steps{
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image'){
            steps{
                sh 'docker build -t $IMAGE .'
            }
        }


        stage('Deploy'){
            steps{
                sh '''
                    docker stop $CONTAINER || true
                    docker rm $CONTAINER || true
                    docker run -d -p 8081:8081 --name $CONTAINER $IMAGE
                '''
            }
        }
    }
}