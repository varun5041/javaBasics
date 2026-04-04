package com.OOPSDAY4.Access.p1;
//same package subclass
import com.OOPSDAY4.Access.p1.A;

public class D extends A{
    public D(String name, int password, int rollno, String dept) {
        super(name, password, rollno, dept);
    }

    public static void main(String[] args) {
        D obj = new D("sachin",1234,50,"INFT");
        obj.name="varun"; //public : same package subclass ✅
        obj.rollno=12; //protected : same package subclass ✅
        obj.dept="AIDS"; //default : same package subclass ✅
         // obj.password=2345; //private ❌
    }
}
