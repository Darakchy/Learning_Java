package data2302;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            String line = in.nextLine();
            if (line.equals("printList")) {
                for (Integer i : list) {
                    System.out.print(i + " ");
                }
                break;
            }
            String[] line_ar = line.split(" ");
            if (line_ar.length == 2) {
                if (line_ar[0].equals("create")) {
                    for (int i = 1; i <= Integer.parseInt(line_ar[1]); i++) {
                        list.add(i);
                    }
                } else if (line_ar[0].equals("add")) {
                    list.add(Integer.parseInt(line_ar[1]));
                } else if (line_ar[0].equals("remove")) {
                    list.remove(Integer.parseInt(line_ar[1]));
                }
            }
            if (line_ar.length == 3) {
                if (line_ar[0].equals("add")) {
                    list.add(Integer.parseInt(line_ar[1]), Integer.parseInt(line_ar[2]));
                } else if (line_ar[0].equals("set")) {
                    list.set(Integer.parseInt(line_ar[1]), Integer.parseInt(line_ar[2]));
                }
            }
        }
    }
}


