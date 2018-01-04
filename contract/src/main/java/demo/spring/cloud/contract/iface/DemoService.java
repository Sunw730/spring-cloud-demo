package demo.spring.cloud.contract.iface;

import demo.spring.cloud.contract.constant.ServerName;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 
 * Copyright 2016 Mtime Inc. All rights reserved.
 *
 * @author wang.sun(wang.sun@mtime.com)
 */
@FeignClient(ServerName.SN_DEMO)
@RequestMapping("server/demo")
public interface DemoService {

    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);

}
