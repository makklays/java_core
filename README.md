## Jar Command


### Using Maven and Defaults

Add in `pom.xml`

`<modelVersion>4.0.0</modelVersion>`

`<artifactId>spring-boot</artifactId>`

`<packaging>jar</packaging>`

`<name>spring-boot</name>`

Once we know that’s configured, we can run the package goal:

`mvn package`


### Writing the Dockerfile

`FROM openjdk:17-jdk-alpine`

`MAINTAINER baeldung.com`

`COPY target/docker-java-jar-0.0.1-SNAPSHOT.jar app.jar`

`ENTRYPOINT ["java","-jar","/app.jar"]`


### Building and Testing the Image 

`mvn package`

`docker image build -t docker-java-jar:latest .`

`docker run docker-java-jar:latest`


## Tambien los commandos 

`docker build -t myproject:latest . `

`docker images`

