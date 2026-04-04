package com.OOPSDAY5.Interfaces.ANIMALSEXAMPLE;

public class Main {
    public static void main(String[] args) {
        Animal a = new Cats();
        a.eat();
        a.whoami(); //default method : instance se
        System.out.println(Dog.MAX_AGE); //even if dog object is not created we can still access max age for dog
        //using class name Dog
        System.out.println(Animal.MAX_AGE);
        System.out.println(a.MAX_AGE);


    }
}
