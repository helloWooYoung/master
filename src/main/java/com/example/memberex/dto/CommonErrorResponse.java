package com.example.memberex.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommonErrorResponse {

    private final String code;
    private final String message;
}
