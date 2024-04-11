package OOPs.Problems;

public class Immutable_Lab105 {
    public static void main(String[] args) {
        String name = "Keerti";
        System.out.println(name.concat("Teradale")); //o/p: Keerti Teradale
        System.out.println(name); //Keerti -- Because string is immutable, original string will remain same

        //Contains
        System.out.println(name.contains("e"));// it will check whether name(String Keerti) contains "e" or not
        System.out.println(name.contains("z"));


        //EqualsIgnoreCases
        String expected_r = "Password@123"; //P is capital
        String actual_r = "password@123"; //p is small
        if(expected_r.equalsIgnoreCase(actual_r))// equalsIgnoreCase - it is used to ignore the capital and small letter
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("not a same word");
        }
    }
}
