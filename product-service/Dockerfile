FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/product-service-1.0.0.jar product-service.jar
ENTRYPOINT ["java","-jar","/product-service.jar"]
