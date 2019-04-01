package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *商品枚举
 *@author CCJ
 *@date 2019/3/31 18:35
 **/
public enum ProductResultEnum implements BaseEnum{

    /** 商品返回状态码 **/
    PRODUCT_NOT_EXIST(5001002,"商品不存在"),
    PRODUCT_STATUS_ERROR(5001003,"商品状态不正确"),
    UPDATE_PRODUCT_FAIL(5001004,"修改商品失败"),
    INSERT_PRODUCT_FAIL(5001005,"添加商品失败"),
    PRODUCT_CATEGORY_NOT_EXIST(5001006,"商品分类不存在"),
    PRODUCT_CATEGORY_UPDATE_FAIL(5001007,"商品分类更新失败"),
    PRODUCT_CATEGORY_INSERT_FAIL(5001008,"商品分类添加失败"),
    PRODUCT_CATEGORY_STATUS_ERROR(5001009,"分类状态不正确"),
    SELECT_STORE(5001010,"请选择班组"),
    SPECIFICATIONS_NOT_EXIST(5001011,"商品规格不存在"),
    SPECIFICATIONS_DELETE_FAIL(5001012,"商品规格删除失败"),
    SPECIFICATION_STOCK_NOT_ENOUGH(5001013,"规格库存不足"),
    PRODUCT_CATEGORY_NAME_EXIST(5001014,"商品分类名重复"),
    ;

    Integer code;
    String message;
    ProductResultEnum(Integer code, String message){
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
