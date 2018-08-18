package com.jsunw.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wang.sun on 2018/8/17.
 */
@Configuration
public class RabbitMq {

    /**
     * 1.创建交换机
     * 2.创建队列
     * 3.创建绑定关系
     */

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("TOPIC_EXCHANGE");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("FANOUT_EXCHANGE");
    }

    @Bean
    public Queue firstQueue() {
        return new Queue("FIRST_QUEUE");
    }

    @Bean
    public Queue secondQueue() {
        return new Queue("SECOND_QUEUE");
    }

    @Bean
    public Queue thirdQueue() {
        return new Queue("THIRD_QUEUE");
    }

    @Bean
    public Binding bindSecond(@Qualifier("secondQueue") Queue queue, @Qualifier("topicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(queue)
                .to(exchange)
                .with("#.food.#");
    }

    @Bean
    public Binding bindThird(@Qualifier("thirdQueue") Queue queue, @Qualifier("fanoutExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue)
                .to(exchange);

    }

}
