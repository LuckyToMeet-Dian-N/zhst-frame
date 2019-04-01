package com.sise.controller;

import com.sise.service.UserLonginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Gentle
 * @Date: 2019/3/31 15:18
 * @Description:
 */
@RestController
public class UserLoginController {
    @Autowired
    UserLonginService userLonginService;



}
