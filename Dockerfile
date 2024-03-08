FROM openjdk:17
EXPOSE 8702
#WORKDIR /app
COPY . .
ADD target/theatre-api-service.jar  app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]