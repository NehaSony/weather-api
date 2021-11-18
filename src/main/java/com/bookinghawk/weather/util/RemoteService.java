package com.bookinghawk.weather.util;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;

/**
 * @author Neha Sony
 */


public interface RemoteService {
    int process(int i);
}