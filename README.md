### Writing the Dockerfile

`FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/docker-java-jar-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]`

### Building and Testing the Image 

`mvn package`

`docker image build -t docker-java-jar:latest .`

`docker run docker-java-jar:latest`

