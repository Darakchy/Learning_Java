package Func;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String[] ml = {"Every", "night", "in", "my", "dreams", "i", "see", "you", "i", "feel", "you", "that", "is", "how", "i", "know", "you", "go", "on", "far", "across", "the", "distance", "and", "spaces", "between", "us", "you", "have", "come", "to", "show", "you", "go", "on"};
        System.out.println(maxLengthWord(ml));


        for (int i = 0; i < ml.length; i++) {
            String w = ml[i];
        }

        for (String w : ml) {

        }

    }

    static String maxLengthWord(String[] s) {
        int maxLehgth = getMaxLength(s);
        String buf ="";
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() == maxLehgth) {
                buf = s[i];
                break;
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == maxLehgth) {
                if (s[i].compareTo(buf) < 0) {
                    buf = s[i];
                }
            }
        }
        return buf;
    }

    static int getMaxLength(String[] s) {
        int buf = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > buf) {
                buf = s[i].length();
            }
        }
        return buf;
    }
}
