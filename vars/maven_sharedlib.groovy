pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
    }
    stages {
        stage ('Initialize') {
            steps {
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
            }
        }

        
