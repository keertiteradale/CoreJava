package BasicJava.Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        //Take a input and print the information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name=sc.next();
        System.out.println("Enter Your Age: ");
        int Age=sc.nextInt();
        char c= '\n';
        System.out.println("Your details are as below:" +c+Name+c+Age);
//Or you can print in diff line
        System.out.println("Your Name is: "+Name);
        System.out.println("Your Age is: "+Age);
    }
}
