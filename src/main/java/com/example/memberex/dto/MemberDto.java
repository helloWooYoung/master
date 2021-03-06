package com.example.memberex.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MemberDto {
    @ApiModelProperty(value = "ID", required = true)
    @NotBlank
    @Pattern(regexp = "[1-9a-zA-Z].*")
    @Size(min = 1, max = 20)
    private String loginId;

    @ApiModelProperty(value = "PW", required = true)
    @NotBlank
    @Size(min = 6, max = 20)
    private String loginPw;

    @ApiModelProperty(value = "PWCHECK", required = true)
    private String loginPwCheck;

    @ApiModelProperty(value = "Name", required = true)
    private String userName;

    @ApiModelProperty(value = "Phone", required = true)
    private String userPhone;
}
