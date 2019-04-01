package com.sise.service.impl;

import com.sise.service.UserLonginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Gentle
 * @Date: 2019/3/31 15:48
 * @Description:
 */
@Service
public class UserLonginServiceImpl implements UserLonginService {

    @Autowired
    private RestTemplate restTemplate;



}
