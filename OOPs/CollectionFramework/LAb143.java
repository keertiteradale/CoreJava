package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LAb143 {
    public static void main(String[] args) {
        //To restrict the data
        List<String> mylist = new ArrayList<>();
        mylist.add("Keerti");
        mylist.add("Patil");
        //mylist.add(123);
        //mylist.add(true);

        System.out.println(mylist);
        mylist.set(1,"Digvijay");
        System.out.println(mylist);
        mylist.remove("Digvijay");
        System.out.println(mylist);

        for (int i= 0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        //for each loop
        for (Object o:mylist){
            System.out.println(o);
        }
        //Iterator
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
