package com.sise.exception;
import com.sise.enums.base.BaseEnum;
import lombok.Data;

/**
 *
 *自定义异常类
 *@author CCJ
 *@date 2019/3/31 18:09
**/
@Data
public class SellException extends RuntimeException {
    private Integer code;
    private String msg;

    public  SellException(BaseEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    public SellException(Integer code, String message){
        this.code = code;
        this.msg = message;
    }
}