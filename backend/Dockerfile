FROM openjdk:17-jdk-slim

WORKDIR /app

# Replace with the actual JAR file name from your Gradle build
COPY build/libs/registration_spring-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
