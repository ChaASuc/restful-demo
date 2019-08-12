package com.deschen.restful.restfuldemo.Exception;

import com.deschen.restful.restfuldemo.enums.IEnum;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author deschen
 * @Create 2019/8/12
 * @Description 自定义异常
 * @Since 1.0.0
 */
public class GlobalException extends RuntimeException{

    private Integer code;

    private String msg;

    public GlobalException(IEnum iEnum) {
        this.code = iEnum.getCode();
        this.msg = iEnum.getMsg();
    }

    public GlobalException(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
