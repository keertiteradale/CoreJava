package BasicJava.Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        //User enter the value of x,y,z & take it as double & print the result

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x,y,z");
        double x = sc.nextInt();
        double y =sc.nextInt();
        double z = sc.nextInt();
        double result = 0;
        //A-->x
        //B-->y
        //C-->z
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(2));
        System.out.println(result);
        sc.close();
    }
}
