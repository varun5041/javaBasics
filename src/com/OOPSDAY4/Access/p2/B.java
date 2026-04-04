package com.OOPSDAY4.Access.p2;

import com.OOPSDAY4.Access.p1.A;
//diffferent package and subclass
public class B extends A {


    public B(String name, int password, int rollno, String dept) {
        super(name, password, rollno, dept);
    }

    public static void main(String[] args){
        B b = new B("sahil",2345,58,"INFT");
        b.name="kushwaha"; //public : different package subclass ✅
        b.rollno=23; // protected : different package subclass ✅
        // b.dept="IT"; //default : diffferent package subclass ❌
        //b.password=2321; //private ❌


    }

}
