package OOPs.Exception;

public class Lab135 {
    public static void main(String[] args) {
        String sh = args[0]; //122 - String
        int a = Integer.parseInt(sh);//2 - String to Primitive
        int x = 10/a;
        System.out.println(x);
        System.out.println(a);
    }
}
