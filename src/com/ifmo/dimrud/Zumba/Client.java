package com.ifmo.dimrud.Zumba;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private int birthday;


    public Client(String name, String surname, int birthday) {
        if (name == null || name.length() < 2)
            throw new IllegalArgumentException("name.length()<2");
        if (surname == null || surname.length() < 2)
            throw new IllegalArgumentException("surname.length()<2");
        if (birthday < 1930 || birthday > 2015)
            throw new IllegalArgumentException("Неверный год рождения");
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Имя:" + name +
                "Фамилия" + surname +
                "Год рождения:" + birthday;
    }
}
