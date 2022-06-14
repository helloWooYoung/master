package com.example.memberex.services.member;

import com.example.memberex.controller.CommonException;
import com.example.memberex.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public class MemberSignUpServiceImpl implements MemberSignUpService {
    @Override
    public MemberDto signUpUser(MemberDto dto) {

        if (dto.equals(null)) throw new CommonException();

        return null;
    }


}
