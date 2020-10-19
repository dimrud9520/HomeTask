package com.ifmo.dimrud.School;

public class School {
    final private String schoolName;
    private Director director;
    final private Teacher[] teacherMass = new Teacher[4];
    final private Student[] studentMass = new Student[8];

    public School(String schoolName, Director director) {
        this.schoolName = schoolName;
        if (director == null) {
            throw new IllegalArgumentException("Школа не может функционировать без директора");
        }
        this.director = director;

    }

    public void dayToSchool() {
        director.start();
        for (int i = 0; i < teacherMass.length; i++) {
            if (teacherMass[i] != null) {
                for (int j = 0; j < studentMass.length; j++) {
                    if (studentMass[j] != null && teacherMass[i].teachStudy.equalsIgnoreCase(studentMass[j].underStudy)) {
                        teacherMass[i].teach(studentMass[j]);
                    }
                }
            }
        }
        director.finish();
    }
}
