package Operator_Mar07;

public class Lab016 {
    public static void main(String[] args) {
        //Relational Operator
        int age_keerti =30;
        int age_patil = 34;
        boolean result = age_patil>age_keerti;
        System.out.println(result);

        int a=10;
        int b=10;
        boolean c =(a==b);
        System.out.println(c);
        System.out.println('A'==65);
        //System.out.println('A'=65);  its not allowed because you are assigning the value here. you are not comparing
        System.out.println('A'==65.0);
        System.out.println('A'==65.0f);
        System.out.println('A'==65.2);
        //System.out.println(true==0); //Not valid cant compare boolean & int
        //System.out.println(true>=true);//b/w 2 boolean no comparion
    }
}
