package com.OOPSDAY5.Interfaces.ANIMALSEXAMPLE;

public class Cats implements Animal{
    @Override
    public void eat() {
        System.out.println("CAT EATS");
    }

    @Override
    public void whoami() {
        System.out.println("I AM A CAT");
    }


}
