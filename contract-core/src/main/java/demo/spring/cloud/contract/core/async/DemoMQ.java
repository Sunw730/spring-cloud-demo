package demo.spring.cloud.contract.core.async;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
public class DemoMQ {
    /**
     * #{@link Param}
     */
    public static final String topic_demo = "topic_demo";

    @Getter
    @Setter
    public static class Param implements Serializable {
        private int id;
        private String name;
    }



}
