package com.example.memberex.dto;

import io.swagger.annotations.ApiModelProperty;

public class MemberDto {
    @ApiModelProperty(value = "ID", required = true)
    private String loginId;
    @ApiModelProperty(value = "PW", required = true)
    private String loginPw;
    @ApiModelProperty(value = "PWCHECK", required = true)
    private String loginPwCheck;
    @ApiModelProperty(value = "Name", required = true)
    private String userName;
    @ApiModelProperty(value = "Phone", required = true)
    private String userPhone;
}
