package demo.spring.cloud.handler;

import demo.spring.cloud.contract.core.async.DemoMQ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoHandlerTest {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Test
    public void publish() {
        int i = 0;
        while(i++ < 20) {
            DemoMQ.Param param = new DemoMQ.Param();
            param.setId(i);
            param.setName("name" + i);
            rabbitTemplate.convertAndSend(DemoMQ.topic_demo, param);
        }
        System.out.println("send complete");
    }

}
