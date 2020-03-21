package com.lin.missyou.core;

import com.lin.missyou.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value=Exception.class)
    public void handlerException(HttpServletRequest req, Exception e) {
        System.out.println("hello");
    }

    @ExceptionHandler(value=HttpException.class)
    public void handlerHttpException(HttpServletRequest req, HttpException e) {
        System.out.println("hello,http");
    }
}
