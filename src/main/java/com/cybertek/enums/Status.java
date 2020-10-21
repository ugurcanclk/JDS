package com.cybertek.enums;

public enum Status {

    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");//constrcutor siz boyle yazsam hata verir
    //nedeni: final oldugu icin enum variableri final 3 sekilde assign a value edilir
    //1.same statement
    //2.static block
    //constructor

    private final String value;


    Status(String value){
        this.value=value;
    }


}
