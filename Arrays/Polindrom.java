package Arrays;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[]{1, 2, 3, 4, 1};
        int size = ar.length;
        int buf = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i] != ar[size - i - 1]) {
                buf++;
            }
        }
        if (buf == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }


}
