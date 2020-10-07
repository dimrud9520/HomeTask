package com.ifmo.dimrud.lesson7.Group;

public class Alpenist {
    private String name;
    private String Adres;
    public Alpenist(){}

    public Alpenist(String name) {
        setName(name);
    }

    public Alpenist(String name, String adres) {
        setName(name);
        setAdres(adres);
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        if(name==null||name.length()<3)
        {
            throw new IllegalArgumentException("Имя должно быть больше 3 символов");
        }
        this.name = name;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres)
    {
        if(adres==null||adres.length()<5){
            throw new IllegalArgumentException("Адрес должен быть больше 5 символов");
        }
        this.Adres = adres;
    }
    public String getFullAlp()
    {
        return name + " " + Adres;
    }

    public String toString(){
        return "Alpenist{" +
                "name='" + name + '\'' +
                ", Adres='" + Adres + '\'' +
                '}';
    }
}
