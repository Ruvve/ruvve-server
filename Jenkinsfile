pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'pwd'
        sh './gradlew clean build'
        sh 'nohup $JAVA_HOME/bin/java -jar ./build/libs/ruvve-server-0.0.1-SNAPSHOT.jar > ./nohup.out 2>&1 &'
      }
    }

  }
}