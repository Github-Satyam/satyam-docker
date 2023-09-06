FROM openjdk:8

EXPOSE 8080

ADD target/satyam-docker.jar satyam-docker.jar

ENTRYPOINT ["java","-jar","/satyam-docker.jar"]