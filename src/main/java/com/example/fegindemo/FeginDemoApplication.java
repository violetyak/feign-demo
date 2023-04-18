package com.example.fegindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginDemoApplication.class, args);
    }

}
