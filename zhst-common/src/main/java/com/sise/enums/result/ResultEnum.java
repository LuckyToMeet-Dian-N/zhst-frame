package com.sise.enums.result;

import lombok.Getter;
/**
 *
 *返回状态码枚举
 *@author CCJ
 *@date 2019/3/31 17:13
**/
@Getter
public enum ResultEnum {
    /** 异常状态码  **/
    SERVER_EXCEPTION(1,"服务异常"),
    PARAMETER(1000000,"参数异常"),

    //清洁模块返回码
    CLEANER_MEMBER_PASSWORD_NOT_IN(7001002,"没有输入清洁员的密码"),
    CLEANER_MEMBER_EXIT_ERROR(7001003,"清洁员工号已存在"),
    CLEANER_MEMBER_NOT_ID(7001004,"没有清洁员ID"),
    CLEANER_MEMBER_UPDATE_ERROR(7001005,"更新清洁员失败"),
    CLEANER_MEMBER_NOT_EXIT_ERROR(7001006,"该清洁员不存在"),
    CLEANER_MEMBER_ADD_ERROR(7001007,"添加清洁员失败"),
    CLEANER_MEMBER_UPDATE_PASSWORD_ERROR(7001008,"更新清洁员密码失败"),
    CLEANER_MEMBER_NUMBER_OR_PASSWORD_ERROR(7001009,"工号或者密码错误"),
    CLEANER_MEMBER_NOT_LOGIN_ERROR(7001010,"未登录或登录时间超时"),
    CLEANER_MEMBER_NUMBER_OR_PASSWORD_NOT_EXIT(7001011,"用户名或密码不能为空"),
    CLEANER_MEMBER_PASSWORD_EMPTY_ERROR(7001013,"密码不能为空"),
    CLEANER_MEMBER_OLD_PASSWORD_ERROR(7001014,"旧密码错误"),
    CLEANER_MEMBER_WORK_WAIT_STATUS_ERROR(7001015,"还存在未完成的工作记录"),
    CLEANER_MEMBER_NOT_EXIT_WORK(7001016,"尚未有工作安排"),
    CLEANER_MEMBER_CONTAINER_OR_BOX_NOT_EXIT(7001017,"保温柜或保温箱不存在"),
    CLEANER_MEMBER_WORK_FINISH_ERROR(7001019,"工作已经完成，不用重复提交"),
    CLEANER_MEMBER_NOT_EXIT_CONTAINER_UPDATE(7001020,"没有需要更新状态的保温柜"),
    CLEANER_MEMBER_FINISH_WORK_OPEN_LOCK_ERROR(7001021,"该保温柜的工作已提交完成，不能再次开锁了"),
    CLEANER_MEMBER_WORK_NOT_EXIT_ERROR(7001022,"该工作记录找不到"),
    CLEANER_MEMBER_WORK_TIME_NOT_INPUT_ERROR(7001024,"没有输入清洁时间"),
    CLEANER_MEMBER_WORK_NOT_HAVE_MANY_ERROR(7001026,"没有更多的记录了"),
    CLEANER_MEMBER_HAVE_WAIT_CONTAINER_ERROR(7001027,"提交保温柜还存在待清扫或待清洗的状态，请刷新后重试"),
    CLEANER_MEMBER_HAVE_WAIT_CLEAN_ERROR(7001028,"还存在待清扫或待清洗的状态，请手动更新后重试"),
    CLEANER_MEMBER_PARAM_ERROR(7001029,"清洁员信息参数错误"),
    CLEANER_MEMBER_MODE_NULL(7001030, "当前时间不处于清洁时间段"),
    CLEANER_MEMBER_COUNT_INVALID(7001031,"您处于离职状态，请联系管理员"),
    CLEANER_MEMBER_CLEAN_STATUS_ERROR(7001032,"存在保温柜被禁用或清洁状态已被更改，请手动刷新网页后重试"),
    CLEANER_MEMBER_AREA_ERROR(7001033,"该区域已被禁用，请手动刷新网页"),



    //保温模块
    THERMAL_CONTAINER_FROM_ERROR(8001002,"保温柜信息参数填写有误"),
    THERMAL_CONTAINER_NUMBER_EXIT_ERROR(8001003,"保温柜编号已存在"),
    THERMAL_CONTAINER_NOT_ID(8001004,"没有此保温柜ID"),
    THERMAL_BOX_FROM_ERROR(8001005,"保温箱信息参数填写有误"),
    THERMAL_BOX_NOT_ID(8001006,"没有此保温箱ID"),
    THERMAL_BOX_NUMBER_EXIT_ERROR(8001007,"保温箱编号已存在"),
    THERMAL_AREA_IS_EXIT(8001008, "区域名称或者编号已存在"),
    THERMAL_PARAMETER_IS_EXIT(8001009, "参数填写有误"),
    AREA_THERMAL_FROM_NOT_EXIT(8001010, "保温柜信息为空"),
    THERMAL_BOX_FROM_NOT_EXIT(8001011, "保温箱信息为空"),
    AREA_INFO_NOT_EXIT_ERROR(8001012, "区域不存在"),
    THERMAL_SUBJECT_IS_EXIT(8001013, "区域开锁编号已存在"),


    //权限模块返回码
    ERROR_COUNT_OR_PASSWORD(1101002,"您的账号或密码输入错误"),
    ROLE_EDIT_SUCCESS(1101006,"角色编辑成功"),
    ROLE_IS_EXIST(1101007,"角色名已存在"),
    ROLE_ADD_SUCCESS(1101008,"角色添加成功"),
    ROLE_ADD_OR_EDIT_FAILURE(1101009,"角色添加或编辑失败"),
    ROLE_DEL_SUCCESS(1101010,"角色删除成功"),
    ROLE_DEL_FAILURE(1101011,"角色删除失败"),



    //管理员模块返回码
    ADMINISTRATOR_PARAM_ERROR(1201002,"提交管理员参数有误"),
    ADMINISTRATOR_PASSWORD_NOT_IN(1201003,"密码未输入"),
    ADMINISTRATOR_PASSWORD2_ERROR(1201004,"输入密码不一致"),
    ADMINISTRATOR_PASSWORD_ERROR(1201005,"管理员密码不符合规则，请输入包含大小写字母和数字的组合，不能使用特殊字符，长度在8-18之间"),
    ADMINISTRATOR_ALACOUNT_EXIT_ERROR(1201006,"管理员工号已存在"),
    ADMINISTRATOR_ADD_ERROR(1201007,"管理员添加失败"),
    ADMINISTRATOR_NOT_EXIT_ERROR(1201008,"管理员不存在"),
    ADMINISTRATOR_UPDATE_ERROR(1201009,"管理员更新失败"),
    ADMINISTRATOR_DB_ERROR(1201010,"数据出错，请联系运维人员"),
    ADMINISTRATOR_UPDATE_PASSWORD_ERROR(1201011,"管理员密码更新失败"),
    ADMINISTRATOR_DELETE_ERROR(1201012,"食堂管理员删除失败"),
    ADMINISTRATOR_FINDCANTEEN_ERROR(1201013, "此食堂管理员ID尚未有食堂管理"),

    //开锁模块
    UNLOCK_SUCCESS(1401000, "开锁成功"),
    UNLOCK_FAIL(1401001, "开锁失败"),
    QCCODE_QUERT_NOT_EXIST(1401002, "二维码无效"),
    UNLOCK_PWD__NOT_EXIST(1401003, "开锁码无效"),
    ORDER_STATE_NOT_SUPPORT_UNLOCK(1401004, "当前订单状态不允许开锁"),
    ORDER_CHANG__IS_FAIL(1401005, "子订单状态修改失败,开锁失败"),
    HARDWARE_NOT_SUPPORT_UNLOCK(1401006, "硬件服务器出现故障"),
    ORDER_TIME_NOT_SUPPORT_UNLOCK(1401007,"当前时间段不允许开锁"),

    //系统管理模块
    SYSTEM_SUCCESS(1601000,"成功"),
    SYSTEM_FAIL(1601001,"失败"),
    TIME_ERROR(1601002,"开始时间不能大于结束时间"),
    TIME_CONFLICT(1601003,"时间段冲突请重新设置"),
    TIME_IVALID(1601004,"当前时间无法使用系统"),

    //自选食堂模块
    SAVE_CATEGORY_SUCCESS(2001000, "自选食堂分类操作成功"),
    SAVE_CATEGORY_FAIL(2001001, "自选食堂分类操作失败"),
    SAVE_PRODUCT_SUCCESS(2001002, "自选商品操作成功"),
    SAVE_PRODUCT_FAIL(2001003, "自选商品操作失败"),
    DEL_CATEGORY_SUCCESS(2001004, "自选食堂分类删除成功"),
    DEL_CATEGORY_FAIL(2001005, "自选食堂分类删除失败"),
    NOT_SING_CANTEEN(2002001, "该食堂不存在"),
    NOT_SING_PRODUCT(2002002, "自选单品不存在"),
    NOT_STORE(2002003, "无法找到该班组！");
    ;
    private Integer code;
    private String message;
    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
