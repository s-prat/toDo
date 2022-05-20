FROM openjdk:11-slim as build
MAINTAINER pratibha
COPY target/toDo-0.0.1-SNAPSHOT.jar toDo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/toDo-0.0.1-SNAPSHOT.jar"]