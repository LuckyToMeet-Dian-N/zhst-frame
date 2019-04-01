package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *食堂枚举
 *@author CCJ
 *@date 2019/3/31 18:35
**/
public enum BusinessResultEnum implements BaseEnum{
     /** 商家返回状态码 **/
    BUSINESS_INFO_NOT_EXIST(3001002,"商家不存在"),
    BUSINESS_INFO_STATUS_ERROR(3001003,"商家状态不正确"),
    BUSINESS_INFO_UPDATE_ERROR(3001005,"更新商家信息失败"),
    BUSINESS_INFO_ADD_ERROR(3001006,"添加商家信息失败"),
    BUSINESS_INFO_ID_CARD_EXIST(3001007,"商家身份证号码已存在"),
    ;

    Integer code;
    String message;
    BusinessResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
