FROM java:8
VOLUME /tmp
ADD test.jar test.jar
ENTRYPOINT java -jar /test.jar