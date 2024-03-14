package Loops;

public class Lab060 {
    public static void main(String[] args) {
        for(int i=0;i<1;i++)
        {
            System.out.println("Keerti");
        }//Output will be Keerti(1 time)

        for (int i=0;i>1;i++)
        {
            System.out.println("Teradale");
        }//Output: Nothing, because i>1 -> this condition failed here because i=0 and i>1
        System.out.println("End");//End will print, because this is outside the loop. so whatever you enter outside the loop it will print
    }
}
