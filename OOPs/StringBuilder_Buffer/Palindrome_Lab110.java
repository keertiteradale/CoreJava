package OOPs.StringBuilder_Buffer;

import java.util.Scanner;

public class Palindrome_Lab110 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        boolean res = isPalindrome(str);
        if (res)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb =new StringBuilder(str);
        sb.reverse();
        String original_str= str;
        return original_str.equalsIgnoreCase(sb.toString());
    }
}
