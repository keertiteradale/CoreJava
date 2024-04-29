package OOPs.CollectionFramework.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab149 {
    public static void main(String[] args) {
        List<Integer> myMarks= new ArrayList<>();
        myMarks.add(87);
        myMarks.add(76);
        myMarks.add(90);
        myMarks.add(84);
        myMarks.add(89);

        Collections.sort(myMarks);  //To sort number
        System.out.println(myMarks);
    }
}
