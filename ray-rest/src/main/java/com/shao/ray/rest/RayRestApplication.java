package com.shao.ray.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shao.ray"})
public class RayRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayRestApplication.class, args);
    }
}
