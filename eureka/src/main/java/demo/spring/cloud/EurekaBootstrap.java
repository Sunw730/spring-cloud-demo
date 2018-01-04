package demo.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class, args);
    }

}
