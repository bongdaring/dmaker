package com.fastcam.programming.dmaker.exception;

public class NumberIdAlreadyExistsException extends RuntimeException {
    public NumberIdAlreadyExistsException(){
        super("Number id already exists");
    }
}
