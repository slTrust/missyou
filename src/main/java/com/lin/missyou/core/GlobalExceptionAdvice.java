package com.lin.missyou.core;

import com.lin.missyou.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionAdvice {

    @ExceptionHandler(value=Exception.class)
    public UnifyResponse handlerException(HttpServletRequest req, Exception e) {
        UnifyResponse message = new UnifyResponse(9999,"服务器异常","url");
        return message;
    }

    @ExceptionHandler(value=HttpException.class)
    public UnifyResponse handlerHttpException(HttpServletRequest req, HttpException e) {
        UnifyResponse message = new UnifyResponse(9999,"服务器异常2","url");
        return message;
    }
}
