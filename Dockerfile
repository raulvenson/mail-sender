FROM openjdk:20-jdk
EXPOSE 8080
ADD ./target/*.jar ./app.jar
CMD java -Djava.security.egd=file:/dev/./urandon -jar app.jar