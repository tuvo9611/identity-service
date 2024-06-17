package com.devteria.identityservice.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    INVALID_KEY(1001,"Invalid key"),
    USER_EXISTED(1002,"User existed"),
    USERNAME_INVALID(1003,"Username must be at least 3 character"),
    PASSWORD_INVALID(1004,"Password must be at least 8 character");

    private final int code;
    private final String message;

    ErrorCode(int code,String message){
        this.code = code;
        this.message = message;
    }

}
