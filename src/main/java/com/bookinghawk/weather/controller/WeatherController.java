package com.bookinghawk.weather.controller;

import com.bookinghawk.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neha.Sony
 */
@RestController
@RequestMapping(value = "/v1/api/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;


    @GetMapping("/{city}")
    private ResponseEntity<?> getTodo(@PathVariable("city") String city) {
        try {
            return new ResponseEntity<>(weatherService.getWeather(city), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getCause(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
