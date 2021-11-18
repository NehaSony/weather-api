package com.bookinghawk.weather.service;

import com.bookinghawk.weather.model.WeatherResponse;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.function.Function;

import static com.bookinghawk.weather.util.Constants.APPID;

/**
 * @author Neha.Sony
 */

@Service
public class WeatherService {
    @Value("${weather.url}")
    String url;

    @Value("${weather.key}")
    String key;


    public WeatherResponse getWeather(String city){
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse response = restTemplate.getForObject( url+city+APPID+key, WeatherResponse.class);
        return response;
    }
}
