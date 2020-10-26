package com.ifmo.dimrud.Zumba;

public class Client {
    private String name;
    private String surname;
    private int birthday;
    private Abonement abonement;

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

    public Abonement getAbonement() {
        return abonement;
    }

    public void setAbonement(Abonement abonement) {
        this.abonement = abonement;
    }

    @Override
    public String toString() {
        return "Имя:" + name +
                "Фамилия" + surname +
                "Год рождения:" + birthday;
    }
}
