FROM amazoncorretto:21-alpine-jdk
MAINTAINER Hendi Santika "hendisantika@yahoo.co.id"
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
