package com.sise.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.sise.result.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Gentle
 * @Date 2019/3/31
 * 资源过滤器
 * 所有的资源请求在路由之前进行前置过滤
 */
public class AccessFilter extends ZuulFilter {

    @Autowired
    RestTemplate restTemplate;
    /**
     * 过滤器的类型 pre表示请求在路由之前被过滤
     * @return 类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的执行顺序
     * @return 顺序 数字越大表示优先级越低，越后执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器是否会被执行
     * @return true
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤逻辑
     * @return 过滤结果
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        //判断是否为空
        Object accessToken = request.getHeader("token");

        if (accessToken==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("Authorization token is empty");
            return null;
        }

        //判断是否为伪造token
        ResponseEntity<String> forEntity = restTemplate.getForEntity("", String.class);
        String body = forEntity.getBody();
        if (body==null){

            requestContext.setResponseBody("Authorization token is empty");
        }

        return null;
    }
}