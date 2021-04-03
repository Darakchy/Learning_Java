package L3;

import java.io.IOException;
import java.util.Scanner;

public class L31 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = 0;
        int b = 4;

        while (a++ < b) {
            System.out.print("[");
        }

        while (b-- != 0) {
            System.out.print("]");
        }
    }

}

