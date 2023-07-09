FROM openjdk:17

WORKDIR /app

COPY ./crud-project/target/*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]