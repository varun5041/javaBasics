package com.OOPSDAY5.InnerClasses.MemberInnerClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn= false;
    }

    //member inner class
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn=true;   //we can access the properties of outerclass with the help of method in the inner class
                System.out.println(model + " engine started!");
            }else{
                System.out.println(model + "Engine Stopped!");
            }
        }

        void stop(){
            if(isEngineOn){
                isEngineOn=false;
            }else{
                System.out.println( model + "engine is already off");
            }
        }


    }
}
