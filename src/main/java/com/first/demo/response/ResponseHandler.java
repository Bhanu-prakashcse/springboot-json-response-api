package com.first.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> resposeBuilder(
            String message, HttpStatus status, Object responseObject
    )
    {
        Map<String, Object> mp=new HashMap<>();
        mp.put("message", message);
        mp.put("httpstatus", status);
        mp.put("Data", responseObject);

        return new ResponseEntity<>(mp, status);
    }
 }
