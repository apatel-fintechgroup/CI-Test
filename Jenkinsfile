pipeline {
    agent {
        label "Local_Agent"
    }

    
    stages {
        stage('Build Backend') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

    }

    post {
        success {
            echo "Build completed successfully. WAR files copied to %OUTPUT_DIR%"
        }
        failure {
            echo "Build failed."
        }
    }
}
