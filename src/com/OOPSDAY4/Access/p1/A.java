package com.OOPSDAY4.Access.p1;

import com.OOPSDAY4.Access.p1.A;


public class A {
    public String name;
    private int password;
    protected int rollno;
    String dept;

    public A(String name, int password, int rollno, String dept) {
        this.name = name;
        this.password = password;
        this.rollno = rollno;
        this.dept = dept;
    }

    public void changename(String newname){
        this.name= newname;
    }

    public static void main(String[] args){
        A a = new A("",1234,10,"INFT");
        a.name="sahil"; //public : same class ✅
        a.rollno=11; //protected : same class ✅
        a.dept="aids"; //default : same class ✅
        a.password=1234; //private : same class ✅
    }




}
