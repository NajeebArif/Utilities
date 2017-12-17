FROM maven:3.5.2-jdk-8-alpine
ADD /target/testJavaDocker-1.0-SNAPSHOT.jar /usr/temp
workdir /usr/temp
CMD java -jar testJavaDocker-1.0-SNAPSHOT.jar
