#!/bin/sh 


JUNIT=/usr/share/junit/junit.jar

pushd src/main/java/
make
popd
make



java -classpath .:src/main/java/pcmm.jar:src/main/java/jcops.jar:/usr/share/junit/junit.jar Main &
java -classpath .:src/main/java/pcmm.jar:src/main/java/jcops.jar:/usr/share/junit/junit.jar Test



