package com.educandoweb.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
