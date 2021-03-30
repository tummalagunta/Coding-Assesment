package com.example.palindrome.exception;

import org.springframework.http.HttpStatus;

public enum ResponseMessage {

    APPLICATION_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "1000", "Application Internal Error"),
    DATA_NOT_FOUND(HttpStatus.NO_CONTENT, "1002", "Data not found"),
    VALIDATION_FAILED(HttpStatus.BAD_REQUEST, "1003", "Validation failed"),
    NOT_A_PALINDROME(HttpStatus.BAD_REQUEST, "1004", "Not a palindrome");

    private HttpStatus httpStatus;
    private String code;
    private String message;


    ResponseMessage(HttpStatus httpStatus, String code, String message) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
