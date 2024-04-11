package OOPs.StringBuilder_Buffer;

public class Imp_Lab111 {
    public static void main(String[] args) {
        String s1 = "Keerti";
        StringBuilder s2 = new StringBuilder("Teradale");
        //String s3 = s2;
        //This is not possible. because one is string clas & another is String Builder class
        //So if you dont want to convert we use "toString()" method
        String s3=s2.toString();
        System.out.println(s3);
    }
}
