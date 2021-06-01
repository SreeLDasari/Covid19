pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven3.8.1') {
                    bat 'mvn clean compile'
                }
            }
        }
                
    }
}
