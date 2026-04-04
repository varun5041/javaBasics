package com.OOPSDAY5.InnerClasses.AnonymsInnerClass;

public class Main {
    public static void main(String[] args) {
        ShoppingCart mycart = new ShoppingCart(500);
        mycart.processPayment(new Payment() {
            @Override
            public void pay(int Amount) {
                System.out.println("amount paid successfully");
            }
        });
    }
}
