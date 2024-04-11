package OOPs.StringBuilder_Buffer;

public class ReverseUsingString_Lab109 {
    public static void main(String[] args) {
        // If something is thread safe, we avoid
        //StringBuffer vs StringBuilder
        StringBuilder str1 = new StringBuilder("Keerti");
        str1.reverse();
        System.out.println(str1);

    }
}
