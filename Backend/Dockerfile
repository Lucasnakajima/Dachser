FROM gradle:8.10.2-jdk23 AS build
WORKDIR /app
COPY settings.gradle .
COPY build.gradle .
COPY gradle gradle
COPY src src
RUN gradle bootJar
FROM openjdk:23
COPY --from=build /app/build/libs/DACHSER.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
