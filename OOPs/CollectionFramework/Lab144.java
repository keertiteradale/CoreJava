package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab144 {
    public static void main(String[] args) {
        List<String> mylist = new LinkedList<>();
        mylist.add("Keerti");
        mylist.add("Patil");

        System.out.println(mylist);

        List<Integer> mylist1 = new LinkedList<>();
        mylist1.add(2);
        mylist1.add(4);
        mylist1.add(1);

        Iterator i=mylist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
