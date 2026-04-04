package com.OOPSDAY5.Interfaces.ANIMALSEXAMPLE;

public interface Animal{
     public static final int MAX_AGE = 150; //by default final and static
    //abstract methods can exist necessary to give implementation in implemented class
    void eat();

    //non abstract but need to be static
    public static void info() {
        System.out.println("this is an animal interface");
    }

    //default can also exist not necessary to give an implementation
    public default void whoami() {
        System.out.println("i am an animal");
    }
}
