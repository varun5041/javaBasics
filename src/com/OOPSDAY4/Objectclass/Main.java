package com.OOPSDAY4.Objectclass;


public class Main {
    static void main(String[] args) {
    ObjectDemo obj1 = new ObjectDemo("varun");
    ObjectDemo obj2 = new ObjectDemo("sahil");
    ObjectDemo obj3 = obj1;
    obj3.name="sachin"; //simultaneously obj 1 also become sachin

    System.out.println(obj1.toString());
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());

    System.out.println("equals method : comparing obj 1 and 2 content: " + obj1.equals(obj2));
    System.out.println("equals method : comparing obj 1 and 3 content: " + obj1.equals(obj3));
    System.out.println("equals method : comparing obj 2 and 3 content: " + obj2.equals(obj3));


    System.out.println("hashCode method: hashcode of obj : " + obj1.hashCode());
    System.out.println("hashCode method: hashcode of obj : " + obj2.hashCode());
    System.out.println("hashCode method: hashcode of obj : " + obj3.hashCode());

    ObjectDemo obj4 = new ObjectDemo("python");
    ObjectDemo obj5 = new ObjectDemo("python");


    if(obj4==obj5){
        System.out.println("4 and 5 points same object"); //expected is false
    }else{
        System.out.println("not point to same object 4 and 5");
    }

    if(obj4.equals(obj5)){
        System.out.println("4 and 5 has same content");
    }else{
        System.out.println("not have same content");
    }

    if (obj3 instanceof ObjectDemo){
        System.out.println("true");
    }

        System.out.println(obj1.getClass().getFields());










}
}
