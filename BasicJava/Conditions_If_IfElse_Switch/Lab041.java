package BasicJava.Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        //Grade Calculator
        //Given a program lets calculate and display the letter grade for a given numberical score(a,B,C,D or F) based on the following scale:
        //A:90-100
        //B:80-90
        //C:70-79
        //D:60-69
        //F:0-59

        //1.Input from user - score(int)--> Grade(char,string)
        //2.Basic logic or force logic
        //3. Write the real code
        //4.Debug the code
        //5. Fix the code and final it

        //Basic Logic
        //If score > && score <100 --> Print A
        //else if score > && score < 89 --> Print B

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score");
        int score = sc.nextInt();
        //char Grade = 'F';

        if(score>=90 && score<=100){
            char grade = 'A';
            System.out.println("Your grade is" +grade);
        }
        else if(score>=80 && score<=89){
            char grade = 'B';
            System.out.println("Your grade is" +grade);
    }
        else if(score>=70 && score<=79){
            char grade = 'C';
            System.out.println("Your grade is" +grade);
        }else if(score>=60 && score<=59){
            System.out.println("Your grade is D"); //We can use like this
        }else
            System.out.println("Your are fail");
        }
}
