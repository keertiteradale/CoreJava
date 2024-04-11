package OOPs.StringBuilder_Buffer;

public class Lab107 {
    public static void main(String[] args) {
        //String builder - build the string
        //String Buffer - Hold the string

        //Immutable in nature(That can't change)
        String s1 = "Keerti";
        String s2 = new String("Patil");
        s1.concat("Teradale");
        System.out.println(s1); //O/P is still Keerti. it wont cange original string

        //Mutable - that can be changed
        StringBuilder s3 =new StringBuilder("Keerti");
        s3.append("Patil"); // append works same as concat
        System.out.println(s3);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb);
    }
}
