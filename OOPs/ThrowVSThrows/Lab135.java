package OOPs.ThrowVSThrows;

public class Lab135 {
    public static void main(String[] args) {
        extracted(0);
    }

    private static void extracted(int b) {
        int k=0;

        if(b==0) {
            throw new ArithmeticException("B can not be ZERO");
        }
        else {
            k = 10/b;
        }
        System.out.println(k);
    }
}
