# the-notion-db-swagger
Attempt to host a Swagger via Github pages on top of the existing notion api 

# How to Build
Have maven and java 22 installed and run `mvn clean install -Dmaven.test.skip=true` on pom.xml level 

# After build, you can start tomcat web server with 
`mvn spring-boot:run` <br/>
It's been configured to work due to the inclusion of `@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })` in main <br/>
The delays the need for the DataSource and doesn't require it to be presented upfront