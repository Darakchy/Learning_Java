package data2302;

import java.util.Scanner;

public class PolindromeFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strIn = in.nextLine();
        System.out.println(isPol(strIn));
    }

    static boolean isPol(String s) {
        String sLC = s.toLowerCase().replaceAll(" ","");
        String revers = new StringBuilder(sLC).reverse().toString();
        return (sLC.equals(revers));
    }
}
