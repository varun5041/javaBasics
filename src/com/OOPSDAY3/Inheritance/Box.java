package com.OOPSDAY3.Inheritance;

public class Box {
double l;
double w;
double h;

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(){
        this.l=0;
        this.h=0;
        this.w=0;
    }

    public Box(Double side){
        this.l=side;
        this.h= side;
        this.w=side;
    }

    public void info(){
        System.out.println("running the box!");
    }

    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    void show(){
        System.out.println("box  show");
    }
}
