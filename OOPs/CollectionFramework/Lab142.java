package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab142 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Keerti");
        mylist.add("Patil");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        mylist.set(1,"Teradale");
        System.out.println(mylist);

        mylist.remove("Teradale");
        System.out.println(mylist);

        mylist.add("PAtil");
        System.out.println(mylist);

        for (int i=0; i<mylist.size(); i++){ //For each loop
            System.out.println(mylist.get(i));
        }
        for (Object o:mylist){ //Enhanced for loop
            System.out.println(o);
        }
    }
}
