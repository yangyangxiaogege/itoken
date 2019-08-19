FROM openjdk:8-jre
MAINTAINER Lusifer <2136362205@qq.com>

ENV APP_VERSION 0.0.1-SNAPSHOT

RUN mkdir /app/
COPY itoken-config-$APP_VERSION.jar /app/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]

EXPOSE 8888