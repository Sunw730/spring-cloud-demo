package demo.spring.cloud.handler;

import com.rabbitmq.client.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
public class RabbitMQTest {

    private static final String topic = "test.topic";
    private static final String UTF8 = "UTF-8";

    private ConnectionFactory factory;
    private Connection connection;
    private Channel channel;

    @Before
    public void init() throws IOException, TimeoutException {
        factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("sunwang");
        factory.setPassword("123456");
        connection = factory.newConnection();
        channel = connection.createChannel();
        channel.queueDeclare(topic, false, false, false, null);
    }

    @After
    public void close() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }

    @Test
    public void publish() throws IOException, TimeoutException {
        String message = "Hello RabbitMQ";
        channel.basicPublish("", topic, null, message.getBytes(UTF8));
        System.out.println("publish: " + message);
    }

    @Test
    public void subscribe() throws IOException {
        //自动回复队列应答 -- RabbitMQ中的消息确认机制
        channel.basicConsume(topic, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, UTF8);
                System.out.println("Customer Received '" + message + "'");
            }
        });
    }

}
