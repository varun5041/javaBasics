package com.OOPSDAY5.Abstractclass;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("hello");
    }
    abstract void career(String name);
    abstract void partner(String partnername);
}
