package Arrays;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        //Take input from user marks of 5 subject and print the mardks

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the 1st subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the 2nd subject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the 3rd subject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the 4th subject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the 5th subject");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("you are fail in this subject" +marks[i]);
            }


        }
    }
}
