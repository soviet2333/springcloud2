package com.example.dmsleuthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableZipkinStreamServer
public class DmSleuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmSleuthServerApplication.class, args);
    }

}
