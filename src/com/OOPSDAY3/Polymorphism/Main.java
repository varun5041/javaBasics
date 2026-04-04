package com.OOPSDAY3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        Circle c = new Circle();
        c.area();
        Shapes c1 = new Circle();
        c1.area();  //object dependent
//        Circle c2 = new Shapes(); //not possible
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
