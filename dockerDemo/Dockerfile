FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

WORKDIR /app

COPY build/libs/dockerDemo-0.0.1-SNAPSHOT.jar demoapp.jar

EXPOSE 8080

CMD ["java", "-jar", "demoapp.jar"]

