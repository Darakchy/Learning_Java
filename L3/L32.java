package L3;

import java.util.Scanner;

public class L32 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int b = 1;
        while (b <= a) {
            System.out.print(b + " ");
            b++;
        }
    }
}
