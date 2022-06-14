package com.example.memberex.controller;

import com.example.memberex.dto.CommonErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = CommonException.class)
    public CommonErrorResponse a() {
        return new CommonErrorResponse("E4000", "잘못된 요청입니다.");
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonErrorResponse 잘못된() {
        return new CommonErrorResponse("E1000", "잘못된 표현식입니다.");
    }

    @ExceptionHandler(value = Exception.class)
    public Map<String, String> handleException(Exception e) {
        Map<String, String> map = new HashMap<>();
        map.put("errMsg", e.getMessage());
        return map;
    }
}


