# Use a lightweight OpenJDK 21 image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file from your project to the container
COPY target/clock-0.0.1-SNAPSHOT.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8090

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
