package Operator_Mar07.Type_Casting_Mar08;

public class Lab020 {
    public static void main(String[] args) {
        //Type Casting : whatever oveflow values will not be trasfer
        //Widening is a process of converting lower type to higher
        //Narrowing is a process of converting higher to lower

        //Widening
        byte b =10;
   //     int a = b; //Implicit casting : b is easily fit into a
        int a =(int)b; //Explicit casting

        //Narrowing
        int a1=300;
       // byte b1=a1; // Invalid - Implicit casting
        byte b1 = (byte)a1; //Explicit => here a1 will not completely transfer to b1 but some value it will transfer from a1 to b1
        System.out.println(b1);
    }
}
