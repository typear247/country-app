# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java","-jar","app.jar"]
