package demo.spring.cloud.contract;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@Configuration
@EnableFeignClients
@ConditionalOnClass(EnableFeignClients.class)
public class FeignClientsAutoConfig {
}
