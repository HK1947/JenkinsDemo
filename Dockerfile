#use the base image to install java
FROM openjdk:latest

#set the working directory inside the container

WORKDIR /app

#Copy the complied jar file into the container

COPY build/libs/GradleDemo.jar /app

#command to run the jar file or our java application

CMD ["java", "-jar", "GradleDemo.jar"]