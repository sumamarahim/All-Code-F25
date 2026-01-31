package com.myapp.models;

public class users {
    String name;
    public users(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello, I am " + name + " Rahim.");
    }
}