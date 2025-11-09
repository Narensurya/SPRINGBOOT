# Use LABEL instead of MAINTAINER (deprecated)
FROM eclipse-temurin:17-jdk-alpine
LABEL maintainer="devtiro.com"
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]