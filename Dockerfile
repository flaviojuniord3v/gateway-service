FROM adoptopenjdk:11-jre-hotspot as builder
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]