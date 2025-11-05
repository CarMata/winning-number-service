FROM openjdk:26-ea-22-slim

# Argumento para el jar (lo pasamos desde Jenkins)
ARG JAR_FILE

# Copiamos el JAR generado por Maven
COPY ${JAR_FILE} app.jar

# Entry point
ENTRYPOINT ["java","-jar","/app.jar"]
