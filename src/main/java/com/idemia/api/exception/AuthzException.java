package com.idemia.api.exception;

public class AuthzException extends RuntimeException {

    public AuthzException(String message) {
        super(message);
    }

    public AuthzException(String message, Throwable cause) {
        super(message, cause);
    }
}
