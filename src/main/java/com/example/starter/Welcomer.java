package com.example.starter;

public class Welcomer {
    private WelcomerProperties welcomerProperties;

    public Welcomer(WelcomerProperties welcomerProperties) {
        this.welcomerProperties = welcomerProperties;
    }

    public void welcome(String name) {
        System.out.println(welcomerProperties.getMessage() + ", " + name + "!");
    }
}
