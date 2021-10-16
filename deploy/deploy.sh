#!/bin/bash


REPOSITORY=/home/ubuntu/ruvve-server
cd $REPOSITORY

APP_NAME=ruvve-server
JAR_NAME=$(ls $REPOSITORY/build/libs/ | grep '.jar' | tail -n 1)

ln -s -f ${JAR_BOX_PATH}${ORIGIN_JAR_NAME} ${TARGET_PATH}


echo "> JAR_NAME => $JAR_NAME"
JAR_PATH=$REPOSITORY/build/libs/$JAR_NAME
echo "> JAR_PATH => $JAR_PATH"

echo "> JAVA_HOME => $JAVA_HOME"
echo "> PATH => $PATH"
whoami

# source /home/ubuntu/.bashrc
source /home/ubuntu/set-env.sh

echo "> JAVA_HOME => $JAVA_HOME"
echo "> PATH => $PATH"

CURRENT_PID=$(pgrep -f $APP_NAME)
echo "> CURRENT_PID => $CURRENT_PID"
if [ -z $CURRENT_PID ]
then
  echo "> 종료할것 없음."
else
  echo "> kill -9 $CURRENT_PID"
  kill -9 $CURRENT_PID
  sleep 5
fi

echo "> $JAR_PATH 배포"
echo "> JAR_OPTS => $JAR_OPTS"

nohup java -jar $JAR_OPTS $JAR_PATH > /dev/null 2> /dev/null < /dev/null &
