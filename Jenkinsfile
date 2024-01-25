pipeline {
    agent any
    tools {
      maven 'MAVEN_LOCAL'
      jdk 'JAVA_LOCAL'
    }
    stages{
        stage("build") {
            steps {
                bat 'mvn clean package -DskipTests=true'
            }
        }
    }
}