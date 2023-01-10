FROM openjdk:19
ENV MONGO_URI=mongodb+srv://root:JsmggHs3Fk8w5$2@neue-fische-cluster.3w4jamf.mongodb.net
EXPOSE 8080
WORKDIR /usr/src/myapp
ADD backend/target/backend-0.0.1-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "java -jar app.jar"]