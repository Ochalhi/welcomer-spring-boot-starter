package com.example.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("welcomer")
public class WelcomerProperties {
    private String message = "Hello";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}