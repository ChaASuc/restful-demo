package com.deschen.restful.restfuldemo.handler;

import com.deschen.restful.restfuldemo.Exception.GlobalException;
import com.deschen.restful.restfuldemo.enums.ResultVOCodeEnum;
import com.deschen.restful.restfuldemo.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author deschen
 * @Create 2019/8/12
 * @Description 全局异常处理
 * @Since 1.0.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({Throwable.class})
    public ResultVO handleThrowable(HttpServletRequest request, Throwable e) {
        log.error("【服务器异常】execute methond exception error.url is {}，exception = {}",
                request.getRequestURI(), e);
        return ResultVO.failure(ResultVOCodeEnum.SERVER_ERROR);
    }

    @ExceptionHandler({GlobalException.class})
    public ResultVO handleGlobalException(HttpServletRequest request, GlobalException e) {
        log.error("【自定义异常】execute methond exception error.url is {}", request.getRequestURI());
        return ResultVO.failure(e.getCode(), e.getMsg());
    }
}
