package Operator_Mar07;

public class Lab028 {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        int c=32;
        int max = a<b?a:b;
        System.out.println(max);
        int min =a>b?a:b;
        System.out.println(min);

        int max1 = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max1);
    }
}
