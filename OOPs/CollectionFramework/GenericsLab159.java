package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsLab159 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        //myList.add("Keerti");
        myList.add(123);
        //myList.add(true);

        System.out.println(myList);

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
