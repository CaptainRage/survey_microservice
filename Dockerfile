FROM adoptopenjdk/openjdk11:alpine
COPY build/libs/*.jar app.jar
CMD ["java","-jar","app.jar"]