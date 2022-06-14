package com.example.memberex.services.member;


import com.example.memberex.dto.MemberDto;

public interface MemberSignUpService {
    MemberDto signUpUser(MemberDto dto) throws Exception;

}
