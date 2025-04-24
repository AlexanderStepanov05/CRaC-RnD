FROM ubuntu:22.04

RUN apt-get update && apt-get install -y criu=4.01-1

FROM azul/zulu-openjdk:21-jdk-crac-latest
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw package -DskipTests


## РАСКОММЕНТИРУЙ НУЖНОЕ ##



# Старт без использования CRaC

#RUN echo "========== РЕЖИМ РАБОТЫ БЕЗ ИСПОЛЬЗОВАНИЯ CRaC =========="
#ENTRYPOINT ["java", "-jar", "/app/target/spring-petclinic-3.4.0-SNAPSHOT.jar"]

# Старт с созданием чекпоинтов

RUN echo "========== РЕЖИМ РАБОТЫ С РУЧНЫМ СОЗДАНИЕМ ЧЕКПОИНТОВ =========="
RUN mkdir -p /crac-checkpoints && \
    chmod -R 777 /crac-checkpoints
ENTRYPOINT ["/bin/sh", "-c", "java -XX:CRaCCheckpointTo=/crac-checkpoints -Dorg.criu.opts=--skip-vdso -jar /app/target/spring-petclinic-3.4.0-SNAPSHOT.jar"]
