package com.cybertek.lambda.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctioanalInterface {

    public static void main(String[] args) {
        //bunlari zaten java arkada create etti interface

        //Aceepts a single parameter and returns a single value

        Function<Integer,Double> half= a-> a/2.0;
        System.out.println(half.apply(10));

        //Does not accept any arguments and returns an object
        Supplier<Double> randomValue= () ->Math.random();
        System.out.println(randomValue.get());

        //Accepts single parameter and does not return any result
        Consumer<Integer> display= a-> System.out.println(a);
        display.accept(10);

        //Accepts single argument and returns true or false
        Predicate<Integer> lessThan= i->i<10;
        System.out.println(lessThan.test(15));


    }
}
