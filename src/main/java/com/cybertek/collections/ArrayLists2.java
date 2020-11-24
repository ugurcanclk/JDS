package com.cybertek.collections;

import com.cybertek.enums.Gender;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {

    public static void createList(){
        List<Integer> lists= new ArrayList<>();
        lists.add(5);
        lists.add(10);
        lists.add(20);

        for(Integer list:lists){
            System.out.println(list);
        }
    }

    public static void createUserList(){
        List<User> userList= new ArrayList<>();
        userList.add(new User("Mike","Smith",new Role(1,"Manager"), Gender.MALE));
        userList.add(new User("Ammy","Taylor",new Role(2,"Admin"),Gender.FEMALE));

        for (User user:userList){
            System.out.println(user.getRole().getDescription());
            System.out.println(user.getFirstName());
            System.out.println(user.getLastName());
            System.out.println(user.getGender());
        }


    }

    public static List<Role> createRoleList(){
        List<Role> roleList= new ArrayList<>();

        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));
        roleList.add(new Role(4,"Employee"));
        roleList.add(new Role(5,"Employee"));

        return roleList;
    }
}
