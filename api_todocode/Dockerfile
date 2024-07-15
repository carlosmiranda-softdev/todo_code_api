FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/api_todocode-0.0.1.jar
COPY ${JAR_FILE} api_todocode.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api_todocode.jar"]