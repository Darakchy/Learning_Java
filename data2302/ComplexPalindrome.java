package data2302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ComplexPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] lineArr = line.split("");
        List<String> lineList = Arrays.asList(lineArr);
        int buf = 0;
        for (int i = 0; i < lineList.size(); i++) {
            if (lineList.get(i).equals(lineList.get(lineList.size() - i - 1))) {
                buf++;
            }
        }
        List<String> lineListRevers = new ArrayList<>();
        for (int i = lineList.size() - 1; i >= 0; i--) {
            lineListRevers.add(lineList.get(i));
        }
        List<String> lineListFinal = new ArrayList<>(lineList);
        if (buf == 0) { // если не полиндром
            for (int i = 0; i < lineList.size() - 1; i++) { //.sublist
                if (lineList.subList(i, lineList.size()).equals(lineListRevers.subList(0, lineListRevers.size() - i))) {
                    for (int j = i; j < lineListFinal.size(); j++) {
                        lineListFinal.add(lineListRevers.get(i));
                    }
                }
            }
            for (String i : lineListFinal) {
                System.out.print(i);
            }
        } else { // если уже полиндром
            for (String i : lineList) {
                System.out.print(i);
            }
        }
    }
}
