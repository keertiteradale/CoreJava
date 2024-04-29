package OOPs.CollectionFramework;

import OOPs.CustomException.Lab140;

import java.util.List;

public class Lab141 {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Mango","Apple","Banana");
        List Shopping_item= List.of("AATA","MILK","Bread","Butter");
        List my_10th_marks = List.of(91,92,93,94,95);
        List diff_data=List.of("Keerti",true,123);

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.isEmpty());
        System.out.println(Shopping_item.containsAll(Shopping_item));
    }
}
