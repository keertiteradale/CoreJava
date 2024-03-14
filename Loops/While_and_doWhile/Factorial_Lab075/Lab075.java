package Loops.While_and_doWhile.Factorial_Lab075;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //Factorial problem
        //1!--> 1
        //2! -> 2*1
        //3! -> 3*2*1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        long fact =1;
        //5 -> i=1 to 5 ->fact =fact*i, i++
        //A -> init i=1;
        //B -> i<=num
        //C -> i++
        //D -> fact = fact*i
        int i = 1;

  //      while (i<=num){
    //        fact=fact*i;
      //      i++;
        //}
       // System.out.println("Fact " +fact);
        //sc.close();
        for (int j=1;j<=num;j++){
            fact = fact*j;

        }
        System.out.println("Fact " +fact);
        sc.close();
    }
}

