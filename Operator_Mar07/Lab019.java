package Operator_Mar07;

public class Lab019 {
    public static void main(String[] args) {
        int a =12;
        boolean b = a>10||a<5;
        System.out.println(b);

        boolean b1 =!(a>10||a<5);
        System.out.println(b1);

        int a1 =67;
        boolean b3 = !(a1>20&&a1<78);
        System.out.println(b3);
    }
}
