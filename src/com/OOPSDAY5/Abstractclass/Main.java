package com.OOPSDAY5.Abstractclass;

public class Main {
    static void main(String[] args) {
        Son varun = new Son(3);
        varun.career("Engineer");
        varun.partner("Khushbu");

        Parent p = new Parent(45) {
            @Override
            void career(String name) {

            }

            @Override
            void partner(String partnername) {

            }
        };//cannot directly create object need to implement methods here

        Parent.hello();
        p.hello();

    }
}
