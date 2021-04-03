package data2302;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" - ");
        for (String word : words) {
            if (word.contains(", ")) {
                String[] words2 = word.split(", ");
                for (String word2 : words2) {
                    System.out.println("-" + word2);
                }
            } else {
                System.out.println(word + ":");
            }
        }
    }
}
