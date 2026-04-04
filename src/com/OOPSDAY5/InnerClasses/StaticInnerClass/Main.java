package com.OOPSDAY5.InnerClasses.StaticInnerClass;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("ASUS","A15","Windows");

        computer.getOs().display();

        Computer.USB usb = new Computer.USB("Type C");
        usb.getInfo();

    }
}
