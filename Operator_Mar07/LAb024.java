package Operator_Mar07;

public class LAb024 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; //String Pool
        String name1 ="The Testing Academy"; //String Pool
        String name2 = new String("The Testing Academy"); //Heap Area
        System.out.println(name==name1);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));

        String name3 = new String("the testing academy");
        // But in this case it will be false because everything is in lowercase
        System.out.println(name.equals(name3));
        //If we use equalsIgnore Keyword then again it will be TRUE
        System.out.println(name.equalsIgnoreCase(name3));
    }
}
