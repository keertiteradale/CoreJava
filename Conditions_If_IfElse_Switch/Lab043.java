package Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        //Write a program classifies a triagle based on ite side
        //Given three input values representing the lenghts of the side
        //If the triagle is equilateral(all sides are equal)
        //Isoscales(exactly two sides are equal
        //Scalene(no sides are equal)
        //Use an if else statement to classify the triagle

        //side 1, side 2, side 3
        // if side1==side2==side3 --> equilateral
        //else if (side1==side2)||(side2==side3)||(side3==side1) --> Isoscalen
        //else Scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3");
        int side3 = sc.nextInt();

        if((side1==side2)&&((side2==side3))&&(side3==side1))
        {
            System.out.println("equilateral");
        }
        else if((side1==side2)||((side2==side3))||(side3==side1)){
            System.out.println("Isoscalen");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
