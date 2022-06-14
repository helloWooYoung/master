package com.example.memberex.services.member;


import com.example.memberex.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public class MemberSignUpServiceImpl implements MemberSignUpService {
    @Override
    public MemberDto postmemberSignUp(MemberDto dto) throws Exception{

        if(dto.equals(null)) throw new NullPointerException("Data is null");

        return null;
    }



}
