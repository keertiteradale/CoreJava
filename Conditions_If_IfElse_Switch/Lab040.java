package Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        //Multiple Condition
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>=20){
            System.out.println("Number is greater than 20");
        }
        else if(number>10)
        {
            System.out.println("number is > 10");
        }
        else {
            System.out.println("Number is < 20");
        }
    }
}
