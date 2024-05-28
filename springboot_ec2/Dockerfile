FROM openjdk:17-oracle

EXPOSE 8080

ADD target/springboot_ec2-docker.jar springboot_ec2-docker.jar

ENTRYPOINT ["java","-jar","springboot_ec2-docker.jar"]