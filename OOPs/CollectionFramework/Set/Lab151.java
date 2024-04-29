package OOPs.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab151 {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Water Melone");
        fruits.add("Banana");
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
    }
}
