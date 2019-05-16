FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/spring-boot.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
RUN sh -c 'touch /app.jar'