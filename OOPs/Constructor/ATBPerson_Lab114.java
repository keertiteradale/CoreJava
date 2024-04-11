package OOPs.Constructor;

public class ATBPerson_Lab114 {
    public static void main(String[] args) {
        ATBPerson p = new ATBPerson(); //Default Constructor
        p.name = "Keerti";
        System.out.println(p.name);
        p.PrintDetail();// null values will displayed
    }
}
