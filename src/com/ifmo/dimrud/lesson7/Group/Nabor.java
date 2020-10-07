package com.ifmo.dimrud.lesson7.Group;

public class Nabor {
    private int nabor;
    private Alpenist[] alpenists;
    private Alpenist alpenist;


    public void setNabor(int nabor) {
        if (nabor == 0 || nabor == 1) {
            this.nabor = nabor;
        } else {
            throw new IllegalArgumentException("nabor может быть равен только 0(набор закрыт) или 1(набор открыть");
        }

    }

    public Alpenist[] getAlpenists() {
        return alpenists;
    }

    public Alpenist getAlpenist() {
        return alpenist;
    }

    public void setAlpenist(Alpenist alpenist) {
        if (alpenist == null) {
            throw new IllegalArgumentException("alpenist не может быть равен null");
        }
        this.alpenist = alpenist;
    }

        public void setAlpenists(Alpenist[] alpenists)
        {
            if (nabor == 1) {
                for (int i = 0; i < alpenists.length; i++) {
                    this.alpenists[i] = alpenist;

                }
            }
        }
    }
