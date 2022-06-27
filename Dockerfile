FROM maven:3.8.6-openjdk-11
WORKDIR / 
COPY . . 
RUN mvn clean install -Dmaven.test.skip
CMD mvn spring-boot:run 
