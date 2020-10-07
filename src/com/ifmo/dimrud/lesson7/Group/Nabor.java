package com.ifmo.dimrud.lesson7.Group;

public class Nabor {
    private int nabor;
    private Alpenist[] alpenists;


    public void setNabor(int nabor) {
        if (nabor == 0 || nabor == 1) {
            this.nabor = nabor;
        } else {
            throw new IllegalArgumentException("nabor может быть равен только 0(набор закрыт) или 1(набор открыть");
        }

    }

}