package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab145 {
    public static void main(String[] args) {
        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(154);
        numList.add(4);
        numList.add(6);
        numList.add(1000);
        numList.add(6);

        courseList.addAll(numList);
        System.out.println(courseList);

        Iterator i2 = courseList.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }

    }
}
