package com.OOPSDAY1;

//class with constructoors and methods
public class Student {
    String name;
    int rno;
    float marks;

    //constructors
    public Student(int rno, float marks, String name) {

        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

    public Student(Student other){
        this.name=other.name;
        this.marks=other.marks;
        this.rno=other.rno;
    }

    //constructor through constructor (DEFAULT CONSTRUCTOR)
    public Student(){
        System.out.println("OBJECT CREATED");
        this (0,0.0f,"Default");
    }

    //methods
    public void greeting(){
        System.out.println("hello i am " + this.name);
    }

    public void changeName(String newName){
        this.name=newName;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("OBJECT DESTROYED");
    }
}



