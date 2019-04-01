package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *食堂枚举
 *@author CCJ
 *@date 2019/3/31 18:35
**/
public enum CanteenResultEnum implements BaseEnum{
    /** 食堂返回状态码 ***/
    CANTEEN_NOT_EXIST(2001001,"食堂不存在"),
    CANTEEN_PARAM_ERROR(2001002,"提交食堂信息参数有误"),
    CANTEEN_SELECT(2001003,"请选择食堂"),
    CANTEEN_UPDATE_ERROR(2001004,"更新食堂信息失败"),
    CANTEEN_DELETE_ERROR(2001005,"删除食堂失败"),
    CANTEEN_STATUS_ERROR(2001006,"食堂状态不正确"),
    CANTEEN_ADD_ERROR(2001007,"添加食堂信息失败"),
    CANTEEN_NAME_EXIST(2001008,"食堂名称已存在"),
    CANTEEN_STATUS_DISALLOW(2001009,"该食堂处于非营业状态"),
    ;

    Integer code;
    String message;
    CanteenResultEnum(Integer code, String message){
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
