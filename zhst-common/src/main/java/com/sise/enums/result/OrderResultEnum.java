package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *订单枚举
 *@author CCJ
 *@date 2019/3/31 18:35
**/
public enum OrderResultEnum implements BaseEnum{
    /** 订单返回状态码**/
    ORDER_CREATE_SUCCESS(9001000,"创建订单成功"),
    ORDER_CREATE_FAIL(9001001,"创建订单失败"),
    ORDER_QUERY_NOT_EXIST(9001002,"订单不存在"),
    ORDER_NOT_HAS_PAY(9001003,"订单未支付"),
    ORDER_DISTRIBUTE_BOX_IS_EMPTY(9001005,"分配保温箱为空"),
    ORDER_CREATE_PARAMETER_FAIL(9001101,"下单参数有误!"),
    ORDER_CART_EMPTY(9001102,"下单购物车为空"),
    ORDER_IC_CART(9001103,"下单自选购物车存在空套餐"),
    ORDER_CUSTOMER_NUMBER_NOT_EXIST(9001103,"用户学号或工号不合法"),
    ORDER_THERMAL_FULL(9001202,"保温箱占满!"),
    ORDER_THERMAL_DISTRIBUTE_NOT_MANY(9001204,"保温箱数量不足!"),
    ORDER_THERMAL_DISTRIBUTE_ERROR(9001205,"保温箱分配失败"),
    ORDER_QR_CODE_CREATE_ERROR(9001206,"二维码生成失败"),
    ORDER_STOCK_ERROR(9001301,"订单商品库存有误!"),
    ORDER_PRODUCT_STOCK_NOT_ENOUGH(9001304,"库存不足"),
    ORDER_ADDRESS_NOT_EXIST(9001401,"用户收货地址不存在!"),
    OREDER_STATUS_ERROR(9001402, "订单状态不正确"),
    OREDER_COMMENT_SUCCESS(9001403, "订单评价成功"),
    OREDER_COMMENT_FAIL(9001404, "订单评价失败"),
    OREDER_GET_COMMENT_SUCCESS(9001405, "获取订单评价成功"),
    OREDER_GET_COMMENT_FAIL(9001406, "获取订单评价失败"),
    ORDER_REFUND_PROCEED(9001501,"正在退款，请稍等"),
    ORDER_REFUND_FAIL(9001502,"退款失败，请稍后重试"),
    ORDER_REFUND_SUCCESS(9001503,"退款成功"),
    ORDER_REFUND_QUERY_SUCCESS(9001504,"查询退款记录成功"),
    ORDER_REFUND_NOT_PAY(9001505,"该订单尚未支付，无法退款"),
    ORDER_REFUND_NOENOUGH(9001505,"商户余额不足,请咨询商户退款"),
    ORDER_NOT_RECEIPT(9001506,"暂无可接单订单"),
    ORDER_NOT_THERMAL_CONTAINER(9001507,"该区域没有可用保温柜"),
    ORDER_PRODUCT_UNDERCARRIAGE(9001508,"商品已经下架"),
    ORDER_PRODUCT_CHIME_SALE(9001509,"商品已磬售"),
    ORDER_PRODUCT_CANNOT_BUY(9001510,"商品不可购买"),
    ORDER_NOT_PERMIT(9001511,"本时间段不允许下单"),
    ORDER_NOT_DATA(9001512,"无打单数据"),
    ORDER_AREA_IS_PUT_THERMAL(9001513,"该区域没有投放保温箱"),
    ORDER_AREA_IS_DISABLED(9001514,"该区域被禁用"),
    ORDER_CANCEL_SUCCESS(9001601,"取消订单成功"),
    ORDER_CANCEL_FAIL(9001602,"取消订单失败"),
    ORDER_NOT_FOR_CUSTOMER(9001701,"用户无此订单"),
    ORDER_STATUS_ERROR(9001702,"订单状态不正确"),
    ORDER_QUERY_TIME_OUT_SUCCESS(9001703,"查询订单超时时间成功"),
    ORDER_NUM_GT_APPOINT_NUM(9001704,"下单份数超过指定的数量"),
    ;

    Integer code;
    String message;
    OrderResultEnum(Integer code, String message){
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
