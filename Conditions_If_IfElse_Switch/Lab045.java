package Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter browser Name Chrome,firefox,OperaMini,Edge");
        String User_Input = sc.nextLine();


        switch (User_Input.toLowerCase())
        {
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code");
                break;
            case "operamini":
                System.out.println("Execute the OperaMini code");
                break;
            case "edge":
                System.out.println("Execute the Edge code");
                break;
            default:
                System.out.println("I have not idea which browser is this");

        }
    }
}
