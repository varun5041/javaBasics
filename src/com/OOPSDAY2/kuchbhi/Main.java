package com.OOPSDAY2.kuchbhi;

import static com.OOPSDAY2.kuchbhi.Human.sayhello;

public class Main {
    public static void main(String[] args) {
//        Human varun = new Human(20,"VARUN",100000,false);
//        Human rahul = new Human(20,"RAHUL",50000,true);
//        System.out.println(rahul.population);

        sayhello(); //static method run karne ke liye koi object ki zaroorat nahi paddi


    }

//    static-> only static
//    non static-> both static and non static

    public static void hello1(){
        System.out.println("hello");
//        greeting(); //error //static method does not allow non static methods and fields
        //non static method
        Main obj = new Main();
        obj.greeting(); //allowing now, hello1 says either be static or get an object so he got an object of the class that he belongs(Main)

    }

    void greeting(){ //at the end its going to be called inside a static method only which is main method and we need to create an object for that
        System.out.println("hello");
        greeting2(); //hence it is allowing an non static method without writing obj.greeting2()
        hello1(); //allowed static inside non static
    }

    void greeting2(){
        System.out.println("hello2");
    }


}
