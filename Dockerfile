FROM openjdk:8
EXPOSE 9090
ADD target/blog-docker.jar blog-docker.jar
ENTRYPOINT ["java","-jar","/blog-docker.jar"]