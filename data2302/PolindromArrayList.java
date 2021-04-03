package data2302;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolindromArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String list = in.nextLine();
        char[] list2 = list.toCharArray();
        List<Character> polindrom = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            polindrom.add(list2[i]);
        }
        for (int i = list2.length - 1; i >= 0; i--) {
            polindrom.add(list2[i]);
        }
        for (char p : polindrom) {
            System.out.print(p);
        }
    }
}
