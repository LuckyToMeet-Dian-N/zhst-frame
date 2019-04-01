package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *班组枚举
 *@author CCJ
 *@date 2019/3/31 18:35
 **/
public enum  StoreResultEnum implements BaseEnum{
    /** 班组返回状态码 **/
    STORE_INFO_EXECUTE_SUCCESS(4001000,"班组信息执行成功"),
    STORE_INFO_QUERY_FAIL(4001001,"班组信息执行失败"),
    STORE_NOT_EXIST(4001002,"班组ID不存在"),
    STORE_INFO_LIST_IS_EMPTY(4001003,"查询班组列表信息为空"),
    STORE_DELETE_SUCCESS(4001004,"删除班组信息成功"),
    STORE_DELETE_ERROR(4001005,"删除班组信息错误"),
    STORE_UPDATE_SUCCESS(4001008,"更新班组成功"),
    STRRE_ADD_GROUP_NAME_REPEACT(4001010,"新增班组名称重复"),
    ;
    Integer code;
    String message;
    StoreResultEnum(Integer code, String message){
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
