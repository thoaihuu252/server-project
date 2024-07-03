
FROM maven:3-openjdk-17 AS build

COPY . .

# Build the application and skip tests
RUN mvn clean package -DskipTests

# Verify that the build output exists
RUN ls -la /target

FROM openjdk:17-jdk-slim

# Copy the .jar file from the build stage
COPY --from=build /target/DACNPM-0.0.1-SNAPSHOT.jar project-web-2024.jar

# Expose the port the application will run on
EXPOSE 8080

# Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "project-web-2024.jar"]
