package OOPs.CollectionFramework.Queue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab156 {
    public static void main(String[] args) {
        Set<Integer> IS=new HashSet<>();
        IS.add(12343);
        IS.add(12365);
        IS.add(1234);
        IS.add(123);
        IS.add(12);
        IS.add(null);
        System.out.println(IS);

        Set<Integer> IS1=new LinkedHashSet<>();
        IS1.add(12343);
        IS1.add(12365);
        IS1.add(1234);
        IS1.add(123);
        IS1.add(12);
        IS1.add(null);
        System.out.println(IS1);

        Set<Integer> IS2 = new TreeSet<>();
        IS2.add(11);
        IS2.add(23);
        System.out.println(IS2);
        }

    }

