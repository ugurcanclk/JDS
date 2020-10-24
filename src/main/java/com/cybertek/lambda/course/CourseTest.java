package com.cybertek.lambda.course;

public class CourseTest {

    public static void main(String[] args) {

        Course java= new Java();
        java.study();

        Course selenium= new Selenium();
        selenium.study();

        //*******************************************//

        Course java2= new Course() {  //bu interface de sadece 1 abstract method olugunda kullanilacak yontem ama eski
            @Override
            public void study() {
                System.out.println("Studying Java1");
            }
        };

        java2.study();

        Course selenium2= new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium1");
            }
        };

        selenium2.study();

        //*******************************************//

        Course javaCourse =() -> System.out.println("Studying Java2"); //buradada study methodu override ediliyor
        javaCourse.study(); // bunu yaparak create ettigim Java claslarina (Java,Sleenium) ihtiyac duymadan yazmis oldum

        Course seleniumCourse = () -> System.out.println("Studying Selenium2"); //bu interface de sadece 1 abstract method olugunda kullanilacak yontem
        seleniumCourse.study();
    }
}
