package demo.spring.cloud.task.executor;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Objects;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
public abstract class DynamicScheduleTask implements SchedulingConfigurer {

    private CronTrigger trigger;

    private static CronTrigger createCronTrigger(String expression) {
        return new CronTrigger(expression);
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        if(Objects.isNull(this.trigger)) {
            this.trigger = createCronTrigger(this.getExpression());
        }
        taskRegistrar.addTriggerTask(() -> this.execute(),
                triggerContext -> trigger.nextExecutionTime(triggerContext));
    }

    public void setCron(String expression) {
        if(Objects.isNull(this.trigger) || !this.trigger.getExpression().equals(expression)) {
            this.trigger = createCronTrigger(expression);
        }
    }

    protected abstract void execute();

    protected abstract String getExpression();

}
