package Arrays;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //create a program that determines whether a given is a leap year
        //A leap year is divisible by 4,
        //but not by 100 unless it is also divisible by 400
        //use and if- else statement to make this determine

        //input user -- enter leaf year - Y
        //rough code- if(Y%4==0)&&!(Y%100=0)&& (Y%400=0)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a leap year: ");
        int Y=sc.nextInt();

        if((Y%4==0)&&(Y%100!=0)||(Y%400==0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
