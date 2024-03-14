package Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        //Switch Conditions
        //Loops - Which will repeat something
        //Switch condition based - multiple condition

        //Program for switch : Which day is today
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day:");
        int day_num = sc.nextInt();
        //1: Monday
        //2: Tuesday
        //7: Sunday
        //Invalid: Are you mad

        switch (day_num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
                case 3:
                    System.out.println("Wed");
                    break;
            case 4:
                System.out.println("Thus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Mad: entering invalid number");
        }


    }
}
