package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *用户枚举
 *@author CCJ
 *@date 2019/3/31 18:35
**/
public enum CustomerResultEnum implements BaseEnum{
    /** 用户返回状态码 ***/
    CUSTOMER_OPENID_NOT_EXIST(1001002,"OPENID为空"),
    CUSTOMER_TOKEN_NOT_EXIST(1001003,"TOKEN为空"),
    CUSTOMER_BIND_SUCCESS(1001004,"用户绑定成功"),
    CUSTOMER_UNBIND_SUCCESS(1001005,"用户解绑成功"),
    CUSTOMER_BING_MYSISE(1001006,"用户已经绑定过系统"),
    CUSTOMER_NO_BING_MYSISE(1001007,"用户没有绑定系统"),
    CUSTOMER_HAND_BIND(1001008,"该用户已被绑定过"),
    CUSTOMER_NOT_EXIST_INMYSISE(1001009,"MYSISE没有该用户存在"),
    CUSTOMER_NUMBERORPWD_IS_ERROR(1001010,"学号或者密码错误"),
    CUSTOMER_STATUS_IS_ERROR(1001011,"账号不能正常使用"),
    CUSTOMER_NOT_EXIST(1001012,"系统没有该用户信息"),
    CUSTOMER_AREA_NOT_EXIST(1001013, "没有可用区域"),
    CUSTOMER_NUMBER_NOT_EXIST(1001014, "学号或者工号为空"),
    LOGIN_FAIL(1001015,"登录失败，登录信息不正确"),
    LOGOUT_SUCCESS(1001016,"登出成功"),
    TOKEN_NOT_EXIST(1001017,"TOKEN不存在"),
    CUSTOMER_PWD_NOT_EXIST(1001018,"原密码错误"),
    CUSTOMER_ADD_INTO_BLACK_LIST_PARAM_ERROR(1001019,"加入黑名单数据不全"),
    CUSTOMER_BLACK_LIST_ADD_FAIL(1001020,"加入黑名单失败"),
    CUSTOMER_BLACK_LIST_REMOVE_FAIL(1001021,"移除黑名单失败"),
    CUSTOMER_PWD_UPDATE_FAIL(1001022,"更新密码错误"),
    CUSTOMER_MYSCSE_ADD_PARAM_ERROR(1001023,"myscse添加用户信息参数不全"),
    CUSTOMER_MYSCSE_ADD_FAIL(1001024,"myscse添加用户信息失败"),
    CUSTOMER_MYSCSE_STATUS_FAIL(1001025,"myscse更新用户状态失败"),
    ;

    Integer code;
    String message;
    CustomerResultEnum(Integer code, String message){
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
