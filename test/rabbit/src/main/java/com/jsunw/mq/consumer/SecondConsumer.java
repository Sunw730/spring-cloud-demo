package com.jsunw.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by wang.sun on 2018/8/17.
 */
@Component
@RabbitListener(queues = "SECOND_QUEUE")
public class SecondConsumer {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("second queue received: " + msg);
    }

}
