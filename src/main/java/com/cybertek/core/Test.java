package com.cybertek.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {



    public static void main(String[] args) {

        //ayni package altinda oldugu icin import etmedi yukarda
        Methods methods= new Methods();

        //LocalDate
        LocalDate localDate= LocalDate.now();
        int day= localDate.getDayOfMonth();
        System.out.println(day);
        int month= localDate.getMonthValue();
        System.out.println(month);
        int year= localDate.getYear();
        System.out.println(year);

        //LocalTime
        LocalTime localTime= LocalTime.now();
        int hour=localTime.getHour();
        System.out.println(hour);
        int minute=localTime.getMinute();
        System.out.println(minute);
        int second=localTime.getSecond();
        System.out.println(second);

        //LocalDateTime
        LocalDateTime localDateTime= LocalDateTime.now();

        //LocalDateTime.of => is used to get a specific date and time

        LocalDateTime localDateTime1= LocalDateTime.of(1990, Month.OCTOBER,21,19,05);
        System.out.println(localDateTime1);
        

    }
}
