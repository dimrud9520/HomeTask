package com.ifmo.dimrud.lesson7.Group;

public class Gora {
    private String title;
    private int visota;
    private Alpenist alpenist;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null||title.length()<4)
        {
            throw new IllegalArgumentException("Название должно быть больше 4 символов");
        }
        this.title = title;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        if (visota<100)
        {
            throw new IllegalArgumentException("Высота не может быть меньше 100м");
        }
        this.visota = visota;
    }

    public Alpenist getAlpenist() {
        return alpenist;
    }

    public void setAlpenist(Alpenist alpenist) {
        if(alpenist==null){
            throw new IllegalArgumentException("alpenist не может быть равен null");
        }
        this.alpenist = alpenist;
    }
    public String toString()
    {

      return  "Gora{" +
                "title='" + title + '\'' +
                ", visota=" + visota +
                ", alpenist=" + alpenist +
                '}';

    }

}
