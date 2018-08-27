package com.zypcy.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zypcy.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "${demo.service.version}" , application = "${dubbo.application.id}" ,
      url = "dubbo://192.168.20.139:12345")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return userService.sayHello(name);
    }

}
