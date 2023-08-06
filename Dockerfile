# Start with a base image containing Java runtime
FROM openjdk:17

# Make port available to the world outside this container
EXPOSE 8090

ADD target/spring-jenkins-docker-integration.war spring-jenkins-docker-integration.war


# Run the war file
ENTRYPOINT [ "java","-jar","/spring-jenkins-docker-integration.war" ]