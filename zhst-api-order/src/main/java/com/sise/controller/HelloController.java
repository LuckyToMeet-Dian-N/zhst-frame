package com.sise.controller;

import com.sise.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Gentle
 * @Date: 2019/3/30 18:30
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "hello")
    public String hello(){

        return helloService.sayHello();
    }

}
