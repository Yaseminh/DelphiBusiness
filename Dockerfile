# Base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Install Maven and build project
RUN apk add --no-cache maven \
    && mvn clean package -DskipTests

# Run the application
CMD ["java", "-cp", "target/buzz-1.0-SNAPSHOT.jar", "org.example.Main"]
