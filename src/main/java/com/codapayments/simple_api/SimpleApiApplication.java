package com.codapayments.simple_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.codapayments.simple_api"})
public class SimpleApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApiApplication.class, args);
    }
}
