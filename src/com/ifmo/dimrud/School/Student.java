package com.ifmo.dimrud.School;

public class Student extends Human implements StudyAble {
    public String underStudy;// изучаемый предмет
    private int levelStudy;// уровень знаний

    public Student(String name, int age, String underStudy) {
        super(name, age);
        if (underStudy == null || underStudy.length() < 3) {
            throw new IllegalArgumentException("underStudy<3");
        }
        this.underStudy = underStudy;
    }

    @Override
    public void study() {
        this.levelStudy += 10;
    }
}
