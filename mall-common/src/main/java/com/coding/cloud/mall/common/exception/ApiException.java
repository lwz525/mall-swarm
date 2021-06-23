package com.coding.cloud.mall.common.exception;

import com.coding.cloud.mall.common.api.IErrorCode;

public class ApiException extends RuntimeException{
    private IErrorCode errorCode;
    public ApiException(IErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}