package com.app.exception;

public class BusinessException extends Exception{
    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
