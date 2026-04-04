package com.OOPSDAY5.InnerClasses.AnonymsInnerClass;

public class ShoppingCart {
    private int TotalAmount;

    public ShoppingCart(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public void processPayment(Payment paymentmethod){
        paymentmethod.pay(TotalAmount);

    }
}
