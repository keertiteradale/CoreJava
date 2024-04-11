package BasicJava.Conditions_If_IfElse_Switch;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {
        //Vowel
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char, If it is Vowel");
char user_input = sc.next().toCharArray()[0];

switch (user_input){
    case 'a':
        System.out.println("Vowel");
        break;
    case 'e':
        System.out.println("Vowel");
        break;
    case 'i':
        System.out.println("Vowel");
    case 'o':
        System.out.println("Vowel");
    case 'u':
        System.out.println("Vowel");
    default:
        System.out.println("Not a vowel");

}

    }
}
