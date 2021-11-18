package com.bookinghawk.weather.config;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;

import java.util.function.Function;

/**
 * @author Neha.Sony
 */

public class Configs {

/*
slidingWindowType	COUNT_BASED
failureRateThreshold	50%
slowCallRateThreshold	100%
slowCallDurationThreshold	60s
minimumNumberOfCalls	100
permittedNumberOfCallsInHalfOpenState	10
maxWaitDurationInHalfOpenState	`0s
*/

    CircuitBreakerConfig conf = CircuitBreakerConfig.custom()
            .failureRateThreshold(20)
            .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
            .slidingWindowSize(10)
            .failureRateThreshold(70.0f)
            .build();


    CircuitBreakerRegistry reg = CircuitBreakerRegistry.of(conf);

    CircuitBreaker circuitBreaker = reg.circuitBreaker("WeatherService");

    RetryConfig config = RetryConfig.custom().maxAttempts(2).build();
    RetryRegistry registry = RetryRegistry.of(config);
    Retry retry = registry.retry("WeatherService");
        /*Function<Integer, Void> decorated
            = Retry.decorateFunction(retry, (Integer s) -> {
        service.process(s);
        return null;
    });*/

}
