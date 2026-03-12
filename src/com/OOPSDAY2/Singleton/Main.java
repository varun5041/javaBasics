package com.OOPSDAY2.Singleton;

public class Main {;
    public static void main(String[] args) {
        Singletonexample obj = Singletonexample.getInstance();

        Singletonexample obj2 = Singletonexample.getInstance();


        System.out.println(obj.equals(obj2)); //are they pointing to the same object?yess -> TRUE
    }
}
