package com.OOPSDAY3.Inheritance;

public class Main {
    void main() {
        /// ////////////////////////////////////////////////////
//        //base class objs
//        Box b1= new Box();
//        System.out.println(b1.toString());
//        Box b2= new Box(5.0);
//        System.out.println(b2.toString());
//        Box b3= new Box(3,4,5);
//        System.out.println(b3.toString());
//
//        //chile objs
//        BowWeight b = new BowWeight(1,2,3,4);
//        System.out.println(b.toString());
//
        /// ////////////////////////////////////////////////////
//        Box b = new BoxWeight(2,3,5,45);
//        System.out.println(b.w); //its the type of the reference variable that determines which members
//        // of the inheritance hirarchy its can access
//
////        System.out.println(b.weight);//error //can only access box members
//        b.show(); //for methods its is the type of object that determines which method to call ,overridden or the one in the base class
        // /  //////////////////////////////////////////////////

        BoxPrice bp = new BoxPrice(5.6,7.3,5);
        System.out.println(bp.toString());

        /// //////////////////////////////////////////////////




    }

}
