package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1= new Employee(101,"Mike","Smith","VA",
                new Role(1,"Developer"));
        Employee e2= new Employee(11,"Ozzy","Smith","IL",
                new Role(2,"SDET"));
        Employee e3= new Employee(67,"Ammy","Smith","DC",
                new Role(3,"DBA"));
        Employee e4= new Employee(33,"Adam","Smith","FL",
                new Role(4,"Project Manager"));
        Employee e5= new Employee(8,"Tammy","Smith","CA",
                new Role(5,"SM"));

        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println(employeeList);  //toString siz basarsam hashcode basar

        employeeList.sort((emp1,emp2)-> emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));  //compareTo() => object ler le calisiyor.
       // employeeList.sort(Comparator.comparing(Employee::getEmployeeId)); yukardakinin aynisi

        System.out.println(employeeList);

        employeeList.sort((rol1,rol2)->rol1.getRole().getId().compareTo(rol2.getRole().getId())); //compareTo() => object ler le calisiyor.bu nedenle gittim role sinifini long dan Integer a cevirdim
       // employeeList.sort(Comparator.comparing(rol -> rol.getRole().getId()));

        System.out.println(employeeList);



    }
}
