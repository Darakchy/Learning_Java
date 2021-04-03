package data1702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(8);


        System.out.println(list);
        System.out.println(listToMap(list));

    }

    static Map<Integer, Integer> listToMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                Integer current = map.get(i);
                map.put(i, current + 1);
            }
            else {
                map.put(i,1);
            }
        }
        return map;
    }


}
