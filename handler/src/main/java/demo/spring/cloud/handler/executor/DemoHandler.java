package demo.spring.cloud.handler.executor;

import demo.spring.cloud.contract.core.async.DemoMQ;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@Component
@RabbitListener(queues = DemoMQ.topic_demo)
public class DemoHandler {

    @RabbitHandler
    public void process(DemoMQ.Param param) throws InterruptedException {
        System.out.println(String.format("receive > {id:%d, name:%s}", param.getId(), param.getName()));
    }

    @Bean
    public static Queue demoQueue() {
        return new Queue(DemoMQ.topic_demo);
    }
}
