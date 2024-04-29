package OOPs.CollectionFramework.Map;

import java.security.Key;
import java.util.Enumeration;
import java.util.Hashtable;

public class Lab158 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1= new Hashtable<>();
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        Enumeration<Integer> e=ht1.keys();
        //Iterating through the hashtable
        //Object
        //Checking for next element in Hashtable object
        //with the help of hasmoreElement() method

        while (e.hasMoreElements())
        {
            //Getting the key of a particular entry
            int key=e.nextElement();

            //Print and display the Rank and Name
            System.out.println("Rank: " + key + "\t\t Name: " +ht1.get(key));
        }
    }
}
