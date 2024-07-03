FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests


# Run stage
FROM openjdk:17-jdk-slim

COPY --from=build /target/deloy-0.0.1-SNAPSHOT.war deloy.war
EXPOSE 8080

ENTRYPOINT ["java","-jar","deloy.war"]