package com.example.kafMsg.event;

public class NonRetryableException extends Exception{



    public NonRetryableException(String message) {
        super(message);
    }


}
