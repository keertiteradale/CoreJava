package OOPs.CollectionFramework.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Lab147 {
    public static void main(String[] args) {
        Vector<String> v2 = new Vector<>();
        v2.add("Keerti");
        v2.add("Patil");
        v2.add("Teradale"); //Array - can store similar only

        Enumeration e = v2.elements(); //Only available in vector
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
