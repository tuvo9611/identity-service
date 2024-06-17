package com.devteria.identityservice.exception;

import lombok.Data;

@Data
public class AppException extends RuntimeException{
private ErrorCode errorCode;
    public AppException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.setErrorCode(errorCode);
    }





}
