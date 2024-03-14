package Loops.While_and_doWhile;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab076 {
    public static void main(String[] args) {
        //Sum of the digit
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        long fact = 0;
        int i=1;
        while (i<=num){
            fact=fact+i;
            i++;
        }
        System.out.println("Sum of the digits:" +fact);
        sc.close();
    }
}
