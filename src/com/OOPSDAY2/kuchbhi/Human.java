package com.OOPSDAY2.kuchbhi;

public class Human {
    int age;
    String name;
    int salary;
    boolean ismarried;
    static int population; //belongs to everyone same not related to a object. it is a property has no relation with indiviual object
    // or it is not different for every object

    public Human(int age, String name,int salary,boolean ismarried) {
        this.age = age;
        this.ismarried = ismarried;
        this.salary = salary;
        this.name = name;
        population+=1;
    }

    public static void sayhello(){
        System.out.println("hello");
//        System.out.println(this.salary); //error salary is non static field
    }

}
