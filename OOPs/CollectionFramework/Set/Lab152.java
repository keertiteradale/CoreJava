package OOPs.CollectionFramework.Set;

import java.util.*;

public class Lab152 {
    public static void main(String[] args) {
        Set CourseSets =new HashSet();
        CourseSets.add("ATB");
        CourseSets.add("MTB");
        CourseSets.add("PytTB");
        CourseSets.add("SDET Blueprint");
        System.out.println(CourseSets);


        Set CourseSets1 =new TreeSet();
        CourseSets1.add("ATB");
        CourseSets1.add("MTB");
        CourseSets1.add("PytTB");
        CourseSets1.add("SDET Blueprint");
        System.out.println(CourseSets1);

        Set CourseSets2 =new LinkedHashSet();
        CourseSets2.add("ATB");
        CourseSets2.add("MTB");
        CourseSets2.add("PytTB");
        CourseSets2.add("SDET Blueprint");
        System.out.println(CourseSets2);


        for (Object o:CourseSets2){
            System.out.println(o);
        }

        Iterator i = CourseSets.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
