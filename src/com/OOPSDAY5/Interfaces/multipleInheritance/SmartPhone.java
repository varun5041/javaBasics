package com.OOPSDAY5.Interfaces.multipleInheritance;

public class SmartPhone implements Camera,Musicplayer,Phone{
    @Override
    public void takePhoto() {
        System.out.println("taking photo with smartphone");
    }

    @Override
    public void takeVideo() {
        System.out.println("taking video in Smartphone");
    }

    @Override
    public void startMusic() {
        System.out.println("playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("music stopped");
    }

    @Override
    public void callSomeone(String number) {
        if(number.length()==10 && number.matches("\\d+")){
            System.out.println("trrr trr trr trr ");
        }else{
            System.out.println("enter 10 digit number please");
        }

    }

    @Override
    public void endCall() {
        System.out.println("call ended");
    }
}
