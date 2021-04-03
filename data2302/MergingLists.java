package data2302;

import java.util.*;

public class MergingLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        while (in.hasNext()){
            list1.add(in.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        while (in.hasNext()){
            list2.add(in.nextInt());
        }
        System.out.println(list1 + " " +  list2);
    }
}
