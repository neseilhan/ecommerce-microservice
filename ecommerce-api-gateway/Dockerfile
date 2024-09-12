FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/ecommerce-api-gateway-0.0.1.jar ecommerce-api-gateway.jar
ENTRYPOINT ["java","-jar","/ecommerce-api-gateway.jar"]
