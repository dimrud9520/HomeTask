package com.ifmo.dimrud.Zumba;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataTime {


    static final private LocalDate TODAYDATA = LocalDate.now();// сегодняшняя дата
    static final private LocalTime CURRENTIME = LocalTime.now();//текущее время
    static final private LocalTime OPENTIME = LocalTime.of(8, 00);//время открытия
    static final private LocalTime CLOSETIME = LocalTime.of(22, 00);//время закрытия
    static final private LocalTime CLOSETIMETODAYAB = LocalTime.of(16, 00);//время окончание действия дневного абонемента

    public static LocalDate getTodayData() {
        return TODAYDATA;
    }

    public static LocalTime getCurrenTime() {
        return CURRENTIME;
    }

    public static LocalTime getOpenTime() {
        return OPENTIME;
    }

    public static LocalTime getCloseTime() {
        return CLOSETIME;
    }

    public static LocalTime getCloseTimeToDayAb() {
        return CLOSETIMETODAYAB;
    }
}
