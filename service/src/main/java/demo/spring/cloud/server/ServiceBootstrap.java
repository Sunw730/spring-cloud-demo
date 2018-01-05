package demo.spring.cloud.server;

import demo.spring.cloud.contract.FeignClientsAutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@EnableEurekaClient
@SpringBootApplication(exclude = FeignClientsAutoConfig.class)
public class ServiceBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBootstrap.class, args);
    }

}
