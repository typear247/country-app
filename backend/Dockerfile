FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the whole libs directory (safe and reliable)
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
