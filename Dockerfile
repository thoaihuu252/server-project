# Stage 1: Build the application
FROM maven:3-openjdk-17 AS build
WORKDIR /app

# Copy the source code into the container
COPY . .

# Build the application and skip tests
RUN mvn clean package -DskipTests

# Verify that the build output exists
RUN ls -la /app/target

# Stage 2: Run the application
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the .jar file from the build stage
COPY --from=build /app/target/project-web-2024-0.0.1-SNAPSHOT.jar project-web-2024.jar

# Expose the port the application will run on
EXPOSE 8080

# Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "project-web-2024.jar"]
