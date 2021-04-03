package L3;

import java.util.Scanner;

public class L34 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int prod = 1;
        int c = 0;
        while (a != 0) {
            int b = a % 10;
            if (b % 2 == 0) {
                prod = prod * b;
            } else {
                c++;
            }
            a = a / 10;
        }
        if (prod == 1) {
            prod = 0;
        }
        System.out.println(c + " " + prod);

    }
}
