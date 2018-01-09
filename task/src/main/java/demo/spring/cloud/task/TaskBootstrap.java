package demo.spring.cloud.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
//@EnableTask
@EnableScheduling
@SpringBootApplication
public class TaskBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(TaskBootstrap.class, args);
    }
//
//    @Bean
//    public static ThreadPoolTaskScheduler scheduler() {
//        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//        scheduler.setPoolSize(10);
//        return scheduler;
//    }
//
//
//    @Component
//    public static class DemoExecutor implements Runnable {
//
//        private int i;
//
//        @Scheduled(cron = "2/5 * * * * *")
//        @Override
//        public void run() {
//            System.out.println("task execute: " + i++ + " [" + LocalDateTime.now().getSecond() + "]");
//        }
//    }

}
