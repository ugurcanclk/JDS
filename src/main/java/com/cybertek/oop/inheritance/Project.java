package com.cybertek.oop.inheritance;

import com.cybertek.oop.encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
//sub class ta super in constructori cagrilmak zorunda
//eger super de default constructor varsa gerek yok fiziken cagirmaya
//ancak default yok baska constructor varsa mecbur sub da cagirmak zorunlu
//super()constructorin icinde olur sub classta
//super() in icine deger yazmaliyim super(1,11.20.2020) gibi mesela

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor // bu sinifta 3 constructor var simdi
//1. no arg // bunu her sinifta yazmam lazim
//2. all args but super() ici bos. asagidaki super i silsek hata vermez ancak super classin no arg li constructorini cagirmis olurum
//3. asagida olan


public class Project extends BaseEntity{

    private String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectStatus;
    private String projectDetail;



    public Project(long id, LocalDateTime insertDateTime, long insertUserId,
                   LocalDateTime lastUpdateDateTime, long lastUpdateUserId,
                   String projectCode, String projectName, User assignedManager,
                   LocalDate startDate, LocalDate endDate, String projectStatus,
                   String projectDetail) {
        //super(); => boylede cagirabilirim super class in constr. ama defaultu cagirmis oldum
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;


    }



}
