FROM openjdk:17
EXPOSE 8080
#Copy the JAR file from the target directory into the container
COPY target/kubernetes-springboot-0.0.1-SNAPSHOT.jar kubernetes-springboot.jar
# Set the entry point to run the JAR file with java
ENTRYPOINT ["java", "-jar", "kubernetes-springboot.jar"]
