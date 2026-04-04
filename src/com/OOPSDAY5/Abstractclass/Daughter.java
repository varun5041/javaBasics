package com.OOPSDAY5.Abstractclass;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("i am going to be " + name);
    }

    @Override
    void partner(String partnername) {
        System.out.println("i love " + partnername);
    }
}
