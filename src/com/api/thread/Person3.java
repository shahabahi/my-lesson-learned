package com.api.thread;

public class Person3 {
    private final String firstName;
    private final String sureName;
    private int age;

    public Person3(String firstName, String sureName, int age) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.age = age;
    }

    public synchronized void birthday() {
        age = age + 1;
    }
}
