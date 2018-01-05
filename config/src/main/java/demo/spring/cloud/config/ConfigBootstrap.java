package demo.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class, args);
    }

}
