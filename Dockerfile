# Base image as dependency for other modules
FROM adoptopenjdk/maven-openjdk11

WORKDIR /app

COPY src src
COPY pom.xml .

RUN mvn clean install -DskipTests
