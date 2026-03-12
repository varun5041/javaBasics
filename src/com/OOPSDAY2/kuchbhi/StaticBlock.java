package com.OOPSDAY2.kuchbhi;

public class StaticBlock {

        static int a =4;
        static int b;

        //gets executed when only once when the first object is created after the class is loaded
        static
        {
            System.out.println("static block called");
            b=a*5;
        }


        public static void main(String[] args){
        StaticBlock obj = new StaticBlock();
            System.out.println(a + " " + b);
            b = b+3;

            StaticBlock obj2 = new StaticBlock();
            System.out.println(a + " " + b);


        }
}
