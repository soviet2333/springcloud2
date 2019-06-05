package com.example.dmturbineserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class DmTurbineServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmTurbineServerApplication.class, args);
    }

}
