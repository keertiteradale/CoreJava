package Loops.While_and_doWhile;

public class Lab077 {
    public static void main(String[] args) {
        //Do While
        //While : Init -> condition -> Body -> increment/decrement
        //Do while: Init -> Body -> Condition -> increment/decrement
        int a=0;
        do {
            System.out.println(a);
            a--;
        }
        while (a>-5);
    }
}
