FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw package -DskipTests
ENTRYPOINT ["java", "-jar", "/app/target/spring-petclinic-3.4.0-SNAPSHOT.jar"]