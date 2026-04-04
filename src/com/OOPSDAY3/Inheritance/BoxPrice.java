package com.OOPSDAY3.Inheritance;

public class BoxPrice extends BoxWeight {
    int price;

    public BoxPrice(double l, double w, double h, double weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }

    public BoxPrice(){
        super();
        this.price=0;
    }

    @Override
    public String toString() {
        return "BoxPrice{" +
                "price=" + price +
                ", weight=" + weight +
                ", l=" + l +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    public BoxPrice(double side, double weight, int price) {
        super(side, weight);
        this.price = price;
    }


}
