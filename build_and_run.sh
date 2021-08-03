#! /bin/sh

gradle build

if [[ "$?" -ne 0 ]] ; then
  echo 'Project could not be built!'; exit $rc
fi

java -jar app/build/libs/app.jar