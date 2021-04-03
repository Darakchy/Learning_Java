package data2302;

import java.util.*;

public class ThreeLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String line3 = in.nextLine();
        String[] lineArr1 = line1.split(" ");
        String[] lineArr2 = line2.split(" ");
        String[] lineArr3 = line3.split(" ");
        List<Integer> lineList1 = new ArrayList<>();
        List<Integer> lineList2 = new ArrayList<>();
        List<Integer> lineList3 = new ArrayList<>();
        List<Integer> lineListFinal = new ArrayList<>();
        for (int i = 0; i < lineArr1.length; i++) {
            lineList1.add(Integer.valueOf(lineArr1[i]));
        }
        for (int i = 0; i < lineArr2.length; i++) {
            lineList2.add(Integer.valueOf(lineArr2[i]));
        }
        for (int i = 0; i < lineArr3.length; i++) {
            lineList3.add(Integer.valueOf(lineArr3[i]));
        }
        for (int i = 0; i < lineList1.size(); i++) {
            if (lineList1.get(i) > 0) {
                lineListFinal.add(lineList1.get(i));
            }
        }
        for (int i = 0; i < lineList2.size(); i++) {
            if (lineList2.get(i) % 2 == 0) {
                lineListFinal.add(lineList2.get(i));
            }
        }
        for (int i = 0; i < lineList3.size(); i++) {
            if (lineList3.get(i) % 7 == 0) {
                lineListFinal.add(lineList3.get(i));
            }
        }
        Collections.sort(lineListFinal);
        for (Integer i : lineListFinal) {
            System.out.print(i + " ");
        }
    }
}
