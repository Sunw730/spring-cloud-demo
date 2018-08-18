package com.jsunw.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by wang.sun on 2018/8/17.
 */
@Component
@RabbitListener(queues = "THIRD_QUEUE")
public class ThirdConsumer {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("third queue received: " + msg);
    }

}
