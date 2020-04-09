FROM openjdk:8
EXPOSE 9090
ADD target/01-MyBlog-0.0.1-SNAPSHOT.jar 01-MyBlog-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/01-MyBlog-0.0.1-SNAPSHOT.jar"]