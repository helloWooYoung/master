package com.example.memberex.controller;

import com.example.memberex.dto.MemberDto;
import com.example.memberex.services.member.MemberSignUpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "회원가입 APIS")
@RequestMapping("/api")
@Controller
public class MemberSignController {
    @Autowired
    private final MemberSignUpService memberSignUpService;

    public MemberSignController(MemberSignUpService memberSignUpService) {
        this.memberSignUpService = memberSignUpService;
    }

    @PostMapping(value = "/users/membersignup")
    @ApiOperation(value = "회원가입")
    public MemberDto postMemberSignUp(@RequestBody MemberDto dto ) throws Exception{
        MemberDto result = memberSignUpService.postmemberSignUp(dto);
        return result;

    }


}
