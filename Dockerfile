FROM openjdk:17-jdk-slim AS pharos-connector
EXPOSE 9999
EXPOSE 5555
ARG JAR_FILE=DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DB-Connector.jar
ENTRYPOINT ["java","-jar","/DB-Connector.jar"]

#WORKDIR /
#COPY DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar build/
#WORKDIR DB-Connector/target/
#ENTRYPOINT ["java","-jar","/DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar"]