# Spring with Cloud Foundry UAA for OAuth2

Overview

## Description

- [UAA Server and Client](https://github.com/shinyay/spring-with-uaa)

## Demo

## Features

- feature:1
- feature:2

## Requirement

### OAuth2 ResourceServer Configuration
```
spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: http://localhost:8080/uaa/oauth/token
```

## Usage
### Run Resource Server
```
$ ./mvnw spring-boot:run
```
## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
