package com.example.memberex.controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test/api")
public class MemberSignController {


    @PostMapping("/api/hello")
    public String hello(){
        return  "hello";
    }


}
