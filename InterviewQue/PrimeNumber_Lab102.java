package InterviewQue;

import java.util.Scanner;

public class PrimeNumber_Lab102 {
    public static void main(String[] args) {
        //Prime number condition
        //0 -> is not a prime number
        //1 -> is not a prime number
        //2 -> is prime number
        // Prime number : A number divisal by itself

        int i =0;
        int flag = 0;
        int m = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        //17-> 2 to 17/2 -> number%i = 0 --- not a prime
        m = n/2;
        if(n==0 || n==1)
        {
            System.out.println("Not a Prome number -->" +n);
        }
        else {
            for (i=2; i<=m; i++)
            {
                if(n%i==0)
                System.out.println("Not a prime number");
                //flag = 1;
                break;
            }

        }
        if(flag == 0)
        {
            System.out.println("Prime number" +n);
        }
    }

}
