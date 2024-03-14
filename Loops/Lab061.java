package Loops;

public class Lab061 {
    public static void main(String[] args) {
        //Print the value of i, but I want to break when i=5
        for (int i=1;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println("Value of i:" +i);
        }
        System.out.println("End");
    }
}
