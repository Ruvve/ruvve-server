pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './gradlew clean build'
        sh 'nohup $JAVA_HOME/bin/java -jar /home/ubuntu/ruvve-server/build/libs/ruvve-server-0.0.1-SNAPSHOT.jar > /home/ubuntu/ruvve-server/nohup.out 2>&1 &'
      }
    }

  }
}