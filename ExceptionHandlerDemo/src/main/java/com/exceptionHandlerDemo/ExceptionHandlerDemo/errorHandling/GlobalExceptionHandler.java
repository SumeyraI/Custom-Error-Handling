package com.exceptionHandlerDemo.ExceptionHandlerDemo.errorHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorObject> handleResourceNotFountException(ResourceNotFoundException exception){
        ErrorObject errorObject=new ErrorObject();
        errorObject.setStatus(HttpStatus.NOT_FOUND.value());
        errorObject.setMessage(exception.getMessage());
        errorObject.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<ErrorObject>(errorObject,HttpStatus.NOT_FOUND);

    }
}
