FROM maven:3.8.4-openjdk-17 AS build

WORKDIR src
COPY src /app/src
COPY pom.xml /app