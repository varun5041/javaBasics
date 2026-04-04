package com.OOPSDAY5.InnerClasses.StaticInnerClass;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;

    public Computer(String brand, String model,String operatingsystemName) {
        this.brand = brand;
        this.model = model;
        this.os=new OperatingSystem(operatingsystemName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void getInfo(){
            System.out.println("USB TYPE:" + this.type);
        }
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void display(){
            System.out.println("Computer Model: "  + model +" brand : "+ brand + "Operating SYSTEM"+osName );
        }


    }

}
