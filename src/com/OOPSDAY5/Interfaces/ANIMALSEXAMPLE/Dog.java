package com.OOPSDAY5.Interfaces.ANIMALSEXAMPLE;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("DOG EATS");
    }

    @Override
    public void whoami() {
        System.out.println("i am a dog");
    }
}
