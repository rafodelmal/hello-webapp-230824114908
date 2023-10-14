# Utiliza una imagen base de Java
FROM openjdk:11

# Copia la aplicación de PetClinic a la imagen
COPY target/elprofenosmiente-68.jar /app/elprofenosmiente-68.jar

# Expone el puerto en el que la aplicación escuchará
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/elprofenosmiente-68.jar"]

