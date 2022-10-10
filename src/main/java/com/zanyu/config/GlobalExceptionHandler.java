package com.zanyu.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult<String> exceptionHandler(Exception e) {
        return CommonResult.error(e.getMessage());
    }
}