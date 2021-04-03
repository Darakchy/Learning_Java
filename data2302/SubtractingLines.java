package data2302;

import java.util.Scanner;

public class SubtractingLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        String s1 = words[0];
        String s2 = words[1];
        for (char c1 : s1.toCharArray()) {
            boolean bool = true;
            for (char c2 : s2.toCharArray()) {
                if (c1 == c2) {
                   bool = false;
                }
            }
            if (bool){
                System.out.print(c1);
            }
        }
        for (char c1 : s2.toCharArray()) {
            boolean bool = true;
            for (char c2 : s1.toCharArray()) {
                if (c1 == c2) {
                    bool = false;
                }
            }
            if (bool){
                System.out.print(c1);
            }
        }
    }
}

