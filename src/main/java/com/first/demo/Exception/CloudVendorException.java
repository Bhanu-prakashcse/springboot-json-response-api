package com.first.demo.Exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus status;

    public CloudVendorException(String message, Throwable cause, HttpStatus status) {
        this.message = message;
        this.cause = cause;
        this.status = status;
    }

    public Throwable getCause() {
        return cause;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
