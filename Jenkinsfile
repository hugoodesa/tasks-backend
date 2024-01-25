pipeline {
    agent any
    tools {
      maven 'Maven 3.9.2'
      jdk 'jdk-21'
    }
    stages{
        stage("build") {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}