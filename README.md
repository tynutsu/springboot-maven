# Introduction 
This project is a template project for any new java spring boot application that is build using maven.
Internally not tested. Only used in innovation lab.

# Getting Started

 Build and refresh your dependencies. Make sure annotation processing is enabled in intellij.

##### Software dependencies - always keep them up to date to avoid vulnerabilities:
For runtime: 

    org.springframework.boot:spring-boot-starter-web
    io.springfox:springfox-swagger2
    io.springfox:springfox-swagger-ui
    org.projectlombok:lombok
    
For test:
    
    org.springframework.boot:spring-boot-starter-test
    org.junit.jupiter:junit-jupiter
    
For productivity - enable annotation processing in intellij to use lombok.

    org.projectlombok:lombok

##### Test dependencies, or compile time only

    org.projectlombok:lombok
    org.springframework.boot:spring-boot-starter-test

##### API references
Swagger is loaded by default when going to localhost:10001. This would show all available REST API.

# Build and Test
Ensure you have the mvn wrapper installed and run: (this will run both build and tests)
 
     mvnw install

To execute the jar:

     mvnw spring-boot:run

# Contribute
This should be the starting point for your code. Use it as a foundation. If you have any suggestions feel free to email train-feedback 
