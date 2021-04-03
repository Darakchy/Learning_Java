package data2302;

import java.util.Scanner;

public class WordsAThroughH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        for (String word:words) {
            char c = word.charAt(0);
            if (c >= 'a' && c <= 'h' || c >= 'A' && c <= 'H'){
                System.out.println(word);
            }
        }
    }
}
