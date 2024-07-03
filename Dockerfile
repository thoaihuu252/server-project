FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests


# Run stage
FROM openjdk:17-jdk-slim

COPY --from=build /target/project-web-2024-0.0.1-SNAPSHOT.jar deloy.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","deloy.jar"]