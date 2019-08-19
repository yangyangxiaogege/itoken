package com.bdqn.common.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceApplication.class,args);
    }
}
