package com.OOPSDAY4.Access.p1;
//same package
public class Main {
    public static void main() {
        A obj = new A("varun",1234,58,"INFT");
        obj.name="sahil"; //public : same package ✅
        obj.rollno=1245; //protected : same package ✅
        obj.dept="CS"; //default : same package ✅
        //obj.password=1232; //private❌




    }
}
