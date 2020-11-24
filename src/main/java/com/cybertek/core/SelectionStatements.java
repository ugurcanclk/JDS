package com.cybertek.core;

public class SelectionStatements {

    public static void demoIfStatement(){

        String userName="Ozzy";
        if(userName.equals("Ozzy")){
            System.out.println("PASS");
        }else if(userName.equals("Mike")){
            System.out.println("FAIL");
        }else {
            System.out.println("Not Valid");
        }
    }

    public static void demoSwitchCaseStatement(){

        String userName="Mike";
        switch (userName){
            case "Ozzy":
                System.out.println("PASS");
                break;
            case "Mike":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Not Valid");
        }
    }

    public static void demoSwitchCaseStatement(String str){

         switch (str){
             case "Ozzy":
                 System.out.println("pass");
                 break;
             case "Mike":
                 System.out.println("fail");
                 break;
             default:
                 System.out.println("not valid");
         }


    }


}
