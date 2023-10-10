
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/elprofenosmiente-68.jar .
EXPOSE 8080
COPY . .
CMD ["java", "-jar", "elprofenosmiente-68.jar"]
