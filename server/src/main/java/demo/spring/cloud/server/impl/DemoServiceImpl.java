package demo.spring.cloud.server.impl;

import demo.spring.cloud.contract.iface.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@RestController
@RequestMapping("server/demo")
public class DemoServiceImpl implements DemoService {

    @Override
    @RequestMapping("hello")
    public String hello(String name) {
        return "[Server] name: " + name;
    }
}
