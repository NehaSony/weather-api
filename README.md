# TODO APP
## _A simple online TODO list_

[![N|Solid](https://miro.medium.com/max/716/1*98O4Gb5HLSlmdUkKg1DP1Q.png)](https://spring.io/)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

This boot application exposes APIs for to get weather of any city.

- The application consumes http://api.openweathermap.org/data/2.5/weather.✨

## Features

• A user can view weather of any city by passing city name.

## Tech

- [Gradle] - Packaged as a gradle project - 7.1.1
- [Java] - Built on open-JDK11
- [Spring Boot] - Leverages web MVC framework provided by Spring Boot 2.5.4
- [resilience4j] - Circuit breaker
- [actuator] - Monitoring the microservice
- [Swagger] - Endpoints are exposed on SwaggerUI

And of course sourced as an open source with a [public repository][dill]
 on GitHub.

## Installation

Requires [Java11](https://www.oracle.com/java/technologies/downloads/#java11) v11+ to run.

Install the dependencies and start the server on Intellij or any other IDE of choice.

```
com.bookinghawk.weather.controller
run WeatherApplication.main()
```

From jar...

```
make sure to place the application.properties in the same location as the jar
java -jar WeatherApplication-0.0.1-SNAPSHOT.jar
```

Application starts as port 8080


Swagger Path :

```
http://localhost:8080/swagger-ui/#/weather-controller
```

## Approach


