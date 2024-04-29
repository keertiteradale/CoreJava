package OOPs.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab157 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("id",2);
        map.put("id",1);
        System.out.println(map);

        map.put("id2",2);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(1));
        System.out.println(map.get("id"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+"-->" +item.getValue());
        }
    }
}
