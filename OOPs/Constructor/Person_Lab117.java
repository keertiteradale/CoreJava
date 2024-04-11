package OOPs.Constructor;

public class Person_Lab117 {
    public static void main(String[] args) {
        Person p =new Person(); //O/P: Default Constructor
        new Person(); //O/P: Default Constructor
        //Person p; //O/P: No object is created


        Person P2 = new Person("Keerti");
        P2.PrintDetail();
    }
}
