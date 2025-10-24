package com.aishwarya.servicediscovery_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoverySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoverySpringBootApplication.class, args);
    }

}
