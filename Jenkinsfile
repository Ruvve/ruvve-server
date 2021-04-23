pipeline {
  agent any
  stages {
  stage('build') {
      steps {
        sh './gradlew clean build'
        sh 'sudo nohup java -jar -Dspring.config.location=classpath:application-config.yml /home/ubuntu/ruvve-server/build/libs/ruvve-server-0.0.1-SNAPSHOT.jar '
      }
    }  
  }
}
