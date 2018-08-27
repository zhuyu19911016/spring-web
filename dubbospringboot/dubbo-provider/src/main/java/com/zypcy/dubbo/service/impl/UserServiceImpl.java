package com.zypcy.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zypcy.dubbo.service.UserService;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {

    public String sayHello(String name) {
        return "Hello, " + name + " from Dubbo Spring Boot ";
    }
}
