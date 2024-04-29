package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab146 {
    public static void main(String[] args) {
        List itcourselist = new ArrayList();
        itcourselist.add("ATB");
        itcourselist.add("MTB");
        itcourselist.add("LAPIT");
        itcourselist.add("SDET Blueprrint");
        itcourselist.add("Java for testers");

        ListIterator li = itcourselist.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        ListIterator lt=itcourselist.listIterator(itcourselist.size());
        while (lt.hasPrevious()){
           // itcourselist.add("Gen AI");
            lt.add("Gen AI");
            System.out.println(lt.previous());
        }
    }
}
