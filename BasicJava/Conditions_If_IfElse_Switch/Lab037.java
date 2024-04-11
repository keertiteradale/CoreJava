package BasicJava.Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int a = sc.nextInt();

        if(a%2==1)
        {
            System.out.println("ODD Number");
        }
        else
        {
            System.out.println("Even number");
        }
    }
}
