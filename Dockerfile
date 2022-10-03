FROM openjdk:11-jre-slim
EXPOSE 8080
ARG JAR_FILE=build/libs/project-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]