package com.example.twitter.clone.exception;

import javax.naming.AuthenticationException;

public class JwtTokenMalformedException extends AuthenticationException {
    public JwtTokenMalformedException(String message){
        super(message);
    }
}
