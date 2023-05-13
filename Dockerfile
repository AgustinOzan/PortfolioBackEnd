FROM amazoncorretto:11-alpine-jdk 
MAINTAINER Agustin
COPY target/Agustin-0.0.1-SNAPSHOT.jar Agu-app.jar
ENTRYPOINT ["java","-jar","/Agu-app.jar"]
