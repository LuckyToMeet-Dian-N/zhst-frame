package com.sise.enums.result;

import com.sise.enums.base.BaseEnum;

/**
 *
 *工作人员枚举
 *@author CCJ
 *@date 2019/3/31 18:35
**/
public enum WorkResultEnum implements BaseEnum{
     /** 工作人员返回状态码 **/
     DELIVER_FINISH(6001002,"配送成功"),
    THERMAL_CONTAINER_NOT_EXIT(6001004,"保温柜不存在"),
    THERMAL_BOX_NOT_EXIT(6001005,"保温箱不存在"),
    DELIVER_WORK_NULL(6001006,"无派送任务"),
    DELIVER_NOT_EXIT(6001007,"无此派送员，请检查用户名和密码"),
    MEMBER_ACCOUNT_OR_PASSWORD_NOT_EXIT(6001008,"用户名或密码不能为空"),
    ASSIGN_MEMBER_SELECT(6001009, "请选择派送员"),
    OMCASTOREY_NULL(6001013,"请选择派送区域"),
    SENDDATE_NULL(6001015,"请设置派送时间"),
    POINT_NULL(6001018, "无配送数据"),
    ASSIGN_MEMBER_IS_EXIT(6001020, "派送员已存在"),
    AREA_NULL(6001022, "请选择配送区域"),
    BOX_NULL(6001023, "没有需要开锁的箱子"),
    OLD_PASSWORD_NULL(6001024,"旧密码不能为空"),
    NEW_PASSWORD_NULL(6001025,"新密码不能为空"),
    ASSGIN_HISTORY_NULL(6001026,"您当前无历史工作记录"),
    OLD_PASSWORD_ERROR(6001027,"旧密码错误，请重新输入"),
    MEMBER_COUNT_INVALID(6001028,"您处于离职状态，请联系管理员"),
    CANTEEN_MEMBER_NOT_EXIT(6001029,"该食堂暂无配送员"),
    ASSGIN_HISTORY_CONMENT_NULL(6001030,"备注内容不能为空"),
    DISTRIBUTE_MODE_NULL(6001031, "当前时间不处于配送时间段"),
    ;

    Integer code;
    String message;
    WorkResultEnum(Integer code, String message){
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
