package com.sise.enums.base;
/**
 *
 *状态码适配器
 *@author CCJ
 *@date 2019/3/31 18:33
**/
public interface BaseEnum {
    Integer CODE = 1;

    String MESSAGE = "服务器繁忙!";
    /**
     *
     *获取状态码
     *@author CCJ
     *@date 2019/3/31 18:33
     *@return  java.lang.Integer
    **/
    Integer getCode();

    /**
     *
     *获取状态码内容
     *@author CCJ
     *@date 2019/3/31 18:33
     *@return  java.lang.String
    **/
    String getMessage();

}
