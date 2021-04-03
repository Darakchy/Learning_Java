package StepicCourse1603;

import java.util.Scanner;

public class PolindromeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strIn = in.nextLine();
        System.out.println(isPol(strIn));
    }

    static boolean isPol(String s) {
        String sLC = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String revers = new StringBuilder(sLC).reverse().toString();
        return (sLC.equals(revers));
    }
}
