package com.ifmo.dimrud.School;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("name<2");
        }
        if (age < 5) {
            throw new IllegalArgumentException("age<5");
        }
        this.name = name;
        this.age = age;
    }
}
