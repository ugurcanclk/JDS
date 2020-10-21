package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.oop.abstraction.service.UserService;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.BaseEntity;
import com.cybertek.oop.inheritance.Project;
import com.cybertek.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        //*********CORE**********//

        Methods methods=new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(6));
        Methods.methodC();  //static method obje ile cagrilmaz

        //*********LOOPS**********//

        Loops.demoForEach();
        Loops.demoForIterator();

        //*********IF/SwitchSta**********//
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        //*********OOP-Encapsulation**********//

        User user = new User("Mike","Smith",new Role(2,"Manager"), Gender.FEMALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getId());//user.getRole() => return object donuyor. birde sonunda getId()ekleyerek o object ten bir deger donduruyorum
        System.out.println(user.getRole().getDescription());

        //*********OOP-Inheritance**********//

        Project project= new Project(1, LocalDateTime.now(),
                1,LocalDateTime.now().minusHours(5),1,"PRJ001",
                "Human Resource CRM",
                new User("Mike","Smith",new Role(1,"Manager"),Gender.FEMALE),
                LocalDate.now(),LocalDate.now().plusMonths(6),"IN_PROGRESS",
                "HCRM Detail Information");

        System.out.println(project.getAssignedManager().getFirstName());
        System.out.println(project.getAssignedManager().getRole().getDescription());

        //*********OOP-Interface**********//

        UserService userService= new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        //*********OOP-Polymorphism**********//

        Employee employee =new Employee();

        BaseEntity employee2= new Employee();

        UserServiceImplementation userServiceImplementation= new UserService();
        //interface

        employee.getEmployeeHours();

       // employee2.getEmployeeHours(); => bu comply error verir cunku reference type decide accebility

        ((Employee) employee2).getEmployeeHours(); //downcasting yaptim


        //*********ENUM**********//

        System.out.println(Gender.MALE);
        System.out.println(Status.IN_PROGRESS);





    }
}
