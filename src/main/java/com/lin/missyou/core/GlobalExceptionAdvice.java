package com.lin.missyou.core;

import com.lin.missyou.exception.http.HttpException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionAdvice {

    @ExceptionHandler(value=Exception.class)
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handlerException(HttpServletRequest req, Exception e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        System.out.println(e); // 打印 异常信息 对于开发阶段来说 适合排查
        // 如果生产环境 则 日志
        UnifyResponse message = new UnifyResponse(9999,"服务器异常",method + " " + requestUrl);
        return message;
    }

    @ExceptionHandler(value=HttpException.class)
    public UnifyResponse handlerHttpException(HttpServletRequest req, HttpException e) {
        UnifyResponse message = new UnifyResponse(9999,"服务器异常2","url");
        return message;
    }
}
