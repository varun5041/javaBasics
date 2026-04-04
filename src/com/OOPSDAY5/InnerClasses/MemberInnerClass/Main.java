package com.OOPSDAY5.InnerClasses.MemberInnerClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();

        engine.start();
        engine.stop();
    }
}
