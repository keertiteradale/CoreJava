package OOPs.Problems;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] int_array = new int[n];
        System.out.println("Enter the element:");
        for (int i =0; i<n; i++)
        {
            int_array[i]=sc.nextInt();
        }
        System.out.println("Output");
        for (int i=0; i<n; i++)
        {
            System.out.println(int_array[i]);
        }
        sc.close();
    }
}
