package Operator_Mar07;

public class Lab030 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //PArt A (Exp=11,a =11) --> ++a - 11
        //PArt B (Exp=11,a =12) --> a++ - 11
        //PArt C (Exp=12,a =13) --> a++ - 12
    }
}
