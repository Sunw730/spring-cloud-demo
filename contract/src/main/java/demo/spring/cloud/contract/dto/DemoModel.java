package demo.spring.cloud.contract.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
public class DemoModel {

    private DemoModel() {}

    @Getter
    @Setter
    public static class Demo {
        private int id;
        private String name;
    }

}
