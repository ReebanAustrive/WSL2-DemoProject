package com.example.demo.controller;

public class MessageResponse {
    private String message;
    private String status;

    public MessageResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }

    // Getters are required for JSON conversion
    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}