package com.ifmo.dimrud.lesson7.Group;

public class Gora {
    private String title;
    private int visota;
    private Nabor nabor;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.length() < 4) {
            throw new IllegalArgumentException("Название должно быть больше 4 символов");
        }
        this.title = title;
    }

    public int getVisota() {
        return visota;
    }

    public void setVisota(int visota) {
        if (visota < 100) {
            throw new IllegalArgumentException("Высота не может быть меньше 100м");
        }
        this.visota = visota;
    }

        public Nabor getNabor() {

            return nabor;
        }

        public void setNabor(Nabor nabor)
        {
           this.nabor = nabor;
        }


        public String toString()
        {
            return "Gora{" +
                    "title='" + title + '\'' +
                    ", visota=" + visota +
                    ", alpenist=" + nabor +
                    '}';

        }

    }
