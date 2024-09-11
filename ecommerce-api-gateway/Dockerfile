FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY target/ecommerce-api-gateway-0.0.1-SNAPSHOT.jar ecommerce-api-gateway.jar
ENTRYPOINT ["java","-jar","/ecommerce-api-gateway.jar"]
