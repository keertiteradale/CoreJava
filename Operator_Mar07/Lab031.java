package Operator_Mar07;

public class Lab031 {
    public static void main(String[] args) {
        int b =10;
        System.out.println(++b + b++);
        System.out.println(b);

        //PArt A = [Exp=11 b=11] ++b --> 11
        //Part B= [Exp=11 ,b=12] b++ --> 11
    }
}
