FROM openjdk:21-slim
ARG JAR_FILE=/target/*.jar
COPY ./target/bimo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]