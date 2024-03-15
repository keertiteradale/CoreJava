package Arrays;

public class Lab079 {
    public static void main(String[] args) {
        //Array
        //Collection of data. they should be of same data type

        int[] marks={96,94,92,50,68};
        //int[] marks1={true,78,88,90,83}; -> not allowed true is boolean
        //int[] mark2={32,45.6,67,56,88}; -> float is not allowed
        System.out.println(marks[0]);
        System.out.println(marks.length);
      //  System.out.println(marks[6]); //Exception
       // System.out.println(marks[5]); //Exception


        int[] a = new int[4];
        //a->0,0,0,0 -> default value of int - 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0] =78;
        System.out.println(a[0]);
        a[1] = 50;
        a[2]=45;
        //System.out.println(a[5]);//ArrayIndexOutOfBoundsException


        final int[] b = new int[4];
        //b -> 0,0,0,0 by default b will be 0
        b[0] = 38;// we can assign value, final is only for lenght
        System.out.println(b[0]);

    }
}
