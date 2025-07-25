package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExampleService;

@RestController
public class ExampleController {
    @Autowired
    private ExampleService exampleService;

    @GetMapping("/process")
    public String process(@RequestParam String input) {
        return exampleService.processData(input);
    }
}