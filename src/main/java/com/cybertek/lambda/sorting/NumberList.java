package com.cybertek.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(5);list.add(15);list.add(3);list.add(500);list.add(25);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

        //2.yol

        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //With Lambda

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, (((o1, o2) -> (o1>o2)?-1:(o1<o2)?1:0)));
        System.out.println(list);

        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);


    }
}
