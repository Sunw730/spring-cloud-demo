package demo.spring.cloud.web.controller;

import demo.spring.cloud.contract.dto.DemoModel;
import demo.spring.cloud.contract.iface.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("hello")
    public String hello(String name) {
        return demoService.hello(name);
    }

    @RequestMapping("serialize")
    public String serialize(DemoModel.Demo demo) {
        return demoService.serialize(demo);
    }


}
