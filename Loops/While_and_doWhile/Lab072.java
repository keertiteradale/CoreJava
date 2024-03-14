package Loops.While_and_doWhile;

public class Lab072 {
    public static void main(String[] args) {
        int i=10;
        while (i>10){
            System.out.println(i);
            i++;
        }
        System.out.println(i);//initialization is ouside so we can print,here outside while we can print
        for(int j=10;j>10;j++)
        {
            System.out.println(j);
        }
        //System.out.println(j); cant print outside the for loop
    }
}
