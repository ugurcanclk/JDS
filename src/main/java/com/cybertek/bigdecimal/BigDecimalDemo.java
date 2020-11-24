package com.cybertek.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double a0= 0.03;
        double b0= 0.04;
        double c0=b0-a0;

        System.out.println(c0);

        BigDecimal a1= new BigDecimal("0.03");
        BigDecimal b1= new BigDecimal("0.04");

    }
}
