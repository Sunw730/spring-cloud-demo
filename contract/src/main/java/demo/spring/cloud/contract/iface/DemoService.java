package demo.spring.cloud.contract.iface;

import demo.spring.cloud.contract.constant.ServerName;
import demo.spring.cloud.contract.dto.DemoModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@FeignClient(ServerName.SN_DEMO)
@RequestMapping("admin/demo")
public interface DemoService {

    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);

    @RequestMapping("serialize")
    String serialize(DemoModel.Demo demo);

}
