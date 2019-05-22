package com.smile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smile.remote.HelloService;


@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String helloConsumer(@PathVariable("name") String name) {
        return helloService.getHello(name);
    }

}