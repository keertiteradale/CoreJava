package OOPs.Problems;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        //Swap to number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();
        int temp =a;
            a=b;
            b=temp;
        System.out.println("Value of a =" +a+ " Value of b = "+b);
    }
}
