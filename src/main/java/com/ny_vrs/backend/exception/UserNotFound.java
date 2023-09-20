package com.ny_vrs.backend.exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(String s){
        super(s);
    }
}
