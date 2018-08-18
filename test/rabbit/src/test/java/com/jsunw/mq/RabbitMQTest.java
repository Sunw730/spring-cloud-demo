package com.jsunw.mq;

import com.jsunw.mq.provider.HelloProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wang.sun on 2018/8/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMQBootstrap.class)
public class RabbitMQTest {

    @Autowired
    private HelloProvider provider;

    @Test
    public void testSend() throws InterruptedException {
        provider.send();
        Thread.sleep(100000);
    }

}
