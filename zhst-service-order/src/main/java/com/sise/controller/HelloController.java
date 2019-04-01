package com.sise.controller;

import com.sise.exception.CheckException;
import com.sise.result.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Gentle
 * @Date: 2019/3/30 18:30
 * @Description:
 */

@RestController
@RequestMapping(value = "api/")
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "hello")
    public ResultBean hello(){

        throw new CheckException("1233123");
//        return "Hello World";
    }

}
