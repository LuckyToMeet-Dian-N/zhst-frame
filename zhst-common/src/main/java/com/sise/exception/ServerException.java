package com.sise.exception;
import com.sise.enums.base.BaseEnum;

/**
 * @ClassName ServerException
 * @Description
 * @Author CCJ
 * @Date 2019/3/31 18:08
 **/
public class ServerException extends RuntimeException {
    private Integer code;
    private String msg;

    public ServerException(BaseEnum resultEnum){
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    public ServerException(Integer code, String message){
        this.code = code;
        this.msg = message;
    }
}
