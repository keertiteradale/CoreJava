package OOPs.Problems;

public class Lab090 {

    public static void main(String[] args) {
        int c= keerti_sum(4,9); //No argument
        int c1 = keerti_sum1(2);
        int c2= keerti_sum2();
        System.out.println(c2);
        System.out.println(c);
        System.out.println(c1);
        SayHello(); //Call to the function


    }
    static int keerti_sum(int a,int b)
    {
        return a+b;
    }
    static int keerti_sum1(int a)
    {
        return a;
    }
    static int keerti_sum2()
    {
        return 99;
    }
    static void SayHello()
    {
        System.out.println("Say Yes");
    }
}
