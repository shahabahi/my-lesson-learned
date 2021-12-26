package com.api.thread;

public class Person2 {
    private final String firstName;
    private final String sureName;
    private int age;

    public Person2(String firstName, String sureName, int age) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.age = age;
    }

    public void birthday() {
        age = age + 1;
    }
}
