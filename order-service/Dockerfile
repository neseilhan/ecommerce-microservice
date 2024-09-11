FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY target/order-service-1.0.0.jar order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]
