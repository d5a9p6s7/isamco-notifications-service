FROM openjdk:11.0.10
EXPOSE 9031
ARG JAR_FILE=target/isamco-cp-service-1.0.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
