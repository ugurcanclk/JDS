package com.cybertek.oop.encapsulation;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {

    private  String firstName;
    private String lastName;
    private Role role;     //getter setter olustururken bu variable lari buyuk harfle kuruyo yani getRole() gibi
    private Gender gender;


}
