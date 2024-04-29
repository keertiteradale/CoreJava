package OOPs.Static.ExampleStatic02;

import java.io.FilterOutputStream;

public class Lab126 {
    public static void main(String[] args) {
       // K01 k; //blank o/p
        K01 k = new K01();
        K01 k1 = new K01();

        k.m1();
        K01.m2(); //Static function can be called directly by class name

        K01 k2 = null;
        //k2.m1();
        k2.m2();



    }
}

class K01{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    int a = 10;
    static int b = 20;


    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2(){
       // System.out.println(a);    Not possible
        System.out.println(b);
    }
}
