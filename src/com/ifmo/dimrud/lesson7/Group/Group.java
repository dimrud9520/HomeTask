package com.ifmo.dimrud.lesson7.Group;

public class Group {
    public static void main(String[] args){

Alpenist vanja=new Alpenist("Ваня", "Санкт-Петербург");
        System.out.println(vanja.getFullAlp());
Gora everest=new Gora();
everest.setVisota(5000);
everest.setTitle("Эверест");
everest.setAlpenist(vanja);
        System.out.println(everest);

    }
}
