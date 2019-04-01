package com.sise.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Gentle
 * @Date: 2019/3/30 18:30
 * @Description:
 */
@FeignClient(value = "zhst-service-order")
public interface HelloService {

    @RequestMapping(value = "api/hello")
    String sayHello();

}
