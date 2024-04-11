package OOPs.Problems;

public class Immutable_Lab112 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        s1.concat(s2);
        System.out.println(s1);



        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
