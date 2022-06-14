package com.example.memberex.services.member;


import com.example.memberex.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberSignUpService {
     MemberDto postmemberSignUp(MemberDto dto) throws Exception;

}
