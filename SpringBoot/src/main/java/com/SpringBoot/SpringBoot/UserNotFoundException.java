package com.SpringBoot.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
//Question6:Imploement Exception Handling for resource not found
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
        super(s);
    }
}
//ForValidation
@ResponseStatus(HttpStatus.BAD_REQUEST)
class INTERNAL_SERVER_ERROR extends RuntimeException{
    public INTERNAL_SERVER_ERROR(String s) {
        super(s);
    }
}