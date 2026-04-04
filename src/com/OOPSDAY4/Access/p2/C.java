package com.OOPSDAY4.Access.p2;

import com.OOPSDAY4.Access.p1.A;

//different package and not subclass : world
public class C {
    public static void main(String[] args) {
        A obj = new A("varun",2314,23,"INFT");
        obj.name="TIMEPASS"; //public : different package and not subclass ✅
        //obj.rollno=10; //protected ❌
        // obj.dept="IT"; //default : diffferent package and not subclass ❌
        //obj.password=2121;//private❌
    }
}
