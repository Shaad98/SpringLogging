package com.example.demo.service;

// import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

// @Slf4j // Lombok annotation to auto-generate SLF4J logger
@Service
public class ExampleService {

    private final Logger log = LoggerFactory.getLogger(ExampleService.class);

    public String processData(String input) {

        // Log at different levels
        log.trace("Entering processData with input: {}", input);
        log.debug("Processing data for input: {}", input);
        log.info("Processing input: {}", input);
        log.warn("This is a warning for input: {}", input);
        
        try {
            if (input == null) {
                throw new IllegalArgumentException("Input cannot be null");
            }
            log.info("Data processed successfully for input: {}", input);
            return "Processed: " + input;
        } catch (IllegalArgumentException e) {
            log.error("Error processing input: {}", input, e);
            throw e;
        }
    }
}
