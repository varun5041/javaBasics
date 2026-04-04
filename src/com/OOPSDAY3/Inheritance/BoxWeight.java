package com.OOPSDAY3.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //used to initialise values present in the parent class
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(){
        super();
        this.weight=0;
    }

    public BoxWeight(Double side, double weight) {
        super(side);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BowWeight{" +
                "weight=" + this.weight +
                ", l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    @Override
    void show() {
        System.out.println("in box wt show");
    }
}
