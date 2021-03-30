package com.example.palindrome.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Error> handleServiceException(ServiceException serviceException) {
        Error error = new Error(serviceException.responseMessage.getMessage(), serviceException.responseMessage.getCode(), serviceException.getMessage());
        return new ResponseEntity<>(error, serviceException.responseMessage.getHttpStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Error> methodArgumentNotValidException(MethodArgumentNotValidException exception) {
        Error error = new Error(ResponseMessage.VALIDATION_FAILED.getMessage(), ResponseMessage.VALIDATION_FAILED.getCode(), exception.getMessage());
        return new ResponseEntity<>(error, ResponseMessage.VALIDATION_FAILED.getHttpStatus());
    }


    @ExceptionHandler(Throwable.class)
    public ResponseEntity<Error> handleAllExceptions(Exception exception) {
        Error error = new Error(ResponseMessage.APPLICATION_ERROR.getMessage(), ResponseMessage.APPLICATION_ERROR.getCode(), exception.getMessage());
        return new ResponseEntity<>(error, ResponseMessage.APPLICATION_ERROR.getHttpStatus());
    }
}
