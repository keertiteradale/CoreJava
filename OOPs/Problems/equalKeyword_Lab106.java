package OOPs.Problems;

public class equalKeyword_Lab106 {
    public static void main(String[] args) {
        String s1 = "Keerti";
        String s2 = new String("Patil");

        System.out.println(s1==s2); // false - references(String pool and object area) are not same. s1 stored at String Pool ans s2 stored in Object area
        System.out.println(s1.equals(s2));//content is equal
        String s3 =new String("keerti");
        System.out.println(s1.equals(s3)); // false - because case sensitive K and k
        System.out.println(s1.equalsIgnoreCase(s3));


    }
}
