package demo.spring.cloud.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@EnableTask
@SpringBootApplication
public class TaskBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(TaskBootstrap.class, args);
    }

}
