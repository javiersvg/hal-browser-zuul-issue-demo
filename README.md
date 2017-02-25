# Spring Boot and OAuth2

Spring boot OAuth2 application based on this [tutorial](https://spring.io/guides/tutorials/spring-boot-oauth2/).
Composed by the following modules:
* ui authentication server authorization server and reverse proxy
* client resource server


## Installation
jdk 1.8 required

## Usage

* start ui server: `./mvnw -pl ui clean spring-boot:run`
* start client server: `./mvnw -pl client clean spring-boot:run`
* access: http://localhost:8080/client