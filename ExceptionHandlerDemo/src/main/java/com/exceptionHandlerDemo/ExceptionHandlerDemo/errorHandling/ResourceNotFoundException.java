package com.exceptionHandlerDemo.ExceptionHandlerDemo.errorHandling;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
