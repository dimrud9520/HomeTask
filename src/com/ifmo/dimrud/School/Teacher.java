package com.ifmo.dimrud.School;

public class Teacher extends Human implements TeachAble {
    public String teachStudy;// преподаваемый предмет

    public Teacher(String name, int age, String teachStudy) {
        super(name, age);
        if (teachStudy == null || teachStudy.length() < 3) {
            throw new IllegalArgumentException("teachStudy<3");
        }
        this.teachStudy = teachStudy;
    }

    @Override
    public void teach(StudyAble student) {
        student.study();

    }

}
