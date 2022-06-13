package com.example.memberex.controller;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@Api(tags = "회원가입 APIS")
public class MemberSignController {
    public MemberSignController(){

    }

    @PostMapping(value = "/api/memberSign")
    @ApiOperation(value = "회원가입")
    public String hello(){
        return  "hello";
    }


}
