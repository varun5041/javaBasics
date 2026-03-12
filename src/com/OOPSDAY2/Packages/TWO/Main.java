package com.OOPSDAY2.Packages.TWO;

import static com.OOPSDAY2.Packages.ONE.A.greet;
import static com.OOPSDAY2.Packages.TWO.A.hello;


public class Main {
    public static void main(String[] args) {
        greet();//this method is from a different class in the same package we can only use it by importing
        hello();
    }
}
