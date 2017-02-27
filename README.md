[![Build Status](https://travis-ci.org/javiersvg/hal-browser-zuul-issue-demo.svg?branch=master)](https://travis-ci.org/javiersvg/hal-browser-zuul-issue-demo)

# Spring Boot and OAuth2

Spring boot OAuth2 application based on this [tutorial](https://spring.io/guides/tutorials/spring-boot-oauth2/).
Composed by the following modules:
* proxy authorization server
* client resource server
* [spring-data-rest-hal-browser](https://github.com/spring-projects/spring-data-rest/tree/master/spring-data-rest-hal-browser)
copy to locally modify the HAL browser


## Installation
jdk 1.8 required
mongodb required

## Usage
* build: `./mvnw clean install`
* start proxy: `./mvnw -pl proxy clean spring-boot:run`
* start client: `./mvnw -pl client clean spring-boot:run`
* access: http://localhost:8080/client

### Steps to reproduce the issue
Once you ahve loged in and in the HAL browser POST a new customer with any given
name and you shall get the following error:
```json
{
  "timestamp": 1488222940259,
  "status": 403,
  "error": "Forbidden",
  "message": "Invalid CSRF Token 'null' was found on the request parameter '_csrf' or header 'X-XSRF-TOKEN'.",
  "path": "/client/customers"
}
```