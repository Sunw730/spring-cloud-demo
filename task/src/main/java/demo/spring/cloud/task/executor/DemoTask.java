package demo.spring.cloud.task.executor;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/*
 *
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@Component
public class DemoTask extends DynamicScheduleTask {

    @Getter
    @Value("${task.execute.demo-task.cron}")
    private String expression;

    @Override
    protected void execute() {
        System.out.println("aaaa:" + LocalDateTime.now().getSecond());
    }

}
