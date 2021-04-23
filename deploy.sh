echo " > 배포 시"

APP_NAME=ruvve-server

CURRENT_PID=$(pgrep -f $APP_NAME)
echo "> CURRENT_PID => $CURRENT_PID"

if [ -z $CURRENT_PID ]
then
  echo "> 종료할 것 없음"
else
  echo "> kill -9 $CURRENT_PID"
  kill -9 $CURRENT_PID
  sleep 5
fi

nohup $JAVA_HOME/bin/java -jar ./build/libs/ruvve-server-0.0.1-SNAPSHOT.jar > ./nohup.out 2>&1 &

echo " > 배포 완료"