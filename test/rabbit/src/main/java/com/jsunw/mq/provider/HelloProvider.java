package com.jsunw.mq.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wang.sun on 2018/8/17.
 */
@Component
public class HelloProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        amqpTemplate.convertAndSend("FIRST_QUEUE", "first_queue");
        amqpTemplate.convertAndSend("TOPIC_EXCHANGE", "com.food.eat", "topic_exchange");
        amqpTemplate.convertAndSend("FANOUT_EXCHANGE", "", "fanout_exchange");
    }

}
