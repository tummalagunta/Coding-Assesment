package com.example.palindrome.exception;

public class ServiceException extends RuntimeException {

    final ResponseMessage responseMessage;

    public ServiceException(ResponseMessage responseMessage) {
        super();
        this.responseMessage = responseMessage;
    }
}
