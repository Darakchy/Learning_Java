package data2302;

import java.util.*;

public class IdenticalItemsFromTwoLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String in1 = in.nextLine();
        String in2 = in.nextLine();
        String[] inlist1 = in1.split(" ");
        String[] inlist2 = in2.split(" ");
        List<String> list1 = Arrays.asList(inlist1);
        Set<String> uni = new HashSet<>(list1);
        List<String> listuni = new ArrayList<>(uni);
        List<String> list2 = Arrays.asList(inlist2);
        Set<Integer> listfinal = new TreeSet<>();
        for (int i = 0; i < listuni.size(); i++) {
            if (list2.contains(listuni.get(i))) {
                listfinal.add(Integer.valueOf(listuni.get(i)));
            }
        }
        for (Integer i : listfinal) {
            System.out.print(i + " ");
        }
    }
}
