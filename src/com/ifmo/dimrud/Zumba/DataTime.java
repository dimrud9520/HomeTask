package com.ifmo.dimrud.Zumba;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataTime {


    static final private LocalDate todayData = LocalDate.now();// сегодняшняя дата
    static final private LocalTime currenTime = LocalTime.now();//текущее время
    static final private LocalTime openTime = LocalTime.of(8, 00);//время открытия
    static final private LocalTime closeTime = LocalTime.of(22, 00);//время закрытия
    static final private LocalTime closeTimeToDayAb = LocalTime.of(16, 00);//время окончание действия дневного абонемента

    public static LocalDate getTodayData() {
        return todayData;
    }

    public static LocalTime getCurrenTime() {
        return currenTime;
    }

    public static LocalTime getOpenTime() {
        return openTime;
    }

    public static LocalTime getCloseTime() {
        return closeTime;
    }

    public static LocalTime getCloseTimeToDayAb() {
        return closeTimeToDayAb;
    }
}
