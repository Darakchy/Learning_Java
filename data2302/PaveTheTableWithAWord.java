package data2302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PaveTheTableWithAWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] linearr = line.split("");
        List<String> lineList = Arrays.asList(linearr);
        String num0 = "";
        for (String i : lineList) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < lineList.size() - 2; i++) {
            num0 += "0 ";
        }
        System.out.println();
        for (int i = 1; i <= lineList.size() - 2; i++) {
            System.out.println(lineList.get(i) + " " + num0 + lineList.get(lineList.size() - 1 - i) + " ");
        }
        for (int i = lineList.size() - 1; i >= 0; i--) {
            System.out.print(lineList.get(i) + " ");
        }
    }
}
