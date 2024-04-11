package OOPs.Problems;

public class Immutable_Lab104 {
    public static void main(String[] args) {
        String name = "Keerti"; //String Pool
        String name2 = new String("Keerti"); //Heap Area

        String str1 = "Hello";
        str1.concat("Keerti");
        System.out.println(str1);
        //O/P: Hello -- Because str1 is still assigned to Hello
        // Hello Keerti is unassigned(it will just create a new string)
        String str2 = "PAtil";
        str2 = str2.concat("Keerti"); // reassigned
        System.out.println(str2); // O/P: PAtil Keerti
    }
}
