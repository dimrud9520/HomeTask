package com.ifmo.dimrud.Zumba;

import java.time.LocalDate;

public class Abonement {
    private int number;

    /*
    1-разовый абонемент
    2-дневной абонемент
    3-полный абонемент
     */
    private LocalDate regData = LocalDate.now();
    private LocalDate endData;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        if (number > 0 && number < 4)
            this.number = number;
        else throw new IllegalArgumentException("number abonement 1-3");

    }

    public LocalDate getRegData() {
        return regData;
    }

    public void endData() {
        if (getNumber() == 1)
            endData=regData.plusDays(1);
        if(getNumber()==2)
            endData=regData.plusMonths(1);
        if(getNumber()==3)
            endData=regData.plusYears(1);

    }

    public LocalDate getEndData() {
        return endData;
    }

    public Abonement(int number) {
        setNumber(number);
    }


}

