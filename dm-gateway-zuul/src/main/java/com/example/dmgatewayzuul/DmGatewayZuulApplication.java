package com.example.dmgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DmGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmGatewayZuulApplication.class, args);
    }

}
