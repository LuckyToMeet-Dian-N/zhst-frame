package com.sise.http;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class RestConfig {

    @Bean
    public RestTemplate customRestTemplate(){
        OkHttp3ClientHttpRequestFactory okHttp3ClientHttpRequestFactory = new OkHttp3ClientHttpRequestFactory();
        return  new RestTemplate(okHttp3ClientHttpRequestFactory);
    }
}
