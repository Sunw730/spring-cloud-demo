package demo.spring.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class WebBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(WebBootstrap.class, args);
    }

}
