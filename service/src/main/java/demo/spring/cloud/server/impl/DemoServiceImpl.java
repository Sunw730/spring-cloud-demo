package demo.spring.cloud.server.impl;

import demo.spring.cloud.contract.dto.DemoModel;
import demo.spring.cloud.contract.iface.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@RestController
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "[Server] name: " + name;
    }

    @Override
    public String serialize(@RequestBody DemoModel.Demo demo) {
        return String.format("{id:%d, name:%s}", demo.getId(), demo.getName());
    }

    @Override
    public DemoModel.Demo get(@PathVariable("id") int id) {
        DemoModel.Demo demo = new DemoModel.Demo();
        demo.setId(id);
        demo.setName("Sunw");
        return demo;
    }
}
