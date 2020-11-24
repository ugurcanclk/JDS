package com.cybertek.enums;

import lombok.Getter;

@Getter


//enum in 2 sekilde oldugunu gosterdi 1. gender class 2. status class

public enum Status {

    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");//constrcutor siz boyle yazsam hata verir
    //nedeni: final oldugu icin enum variableri final 3 sekilde assign a value edilir
    //1.same statement
    //2.static block
    //constructor

    String value;


    Status(String value){

        this.value=value;
    }





}
