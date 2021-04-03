package Arrays;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int s = 0; s < size; s++) {
            ar[s] = in.nextInt();
        }
        int buf;
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size - 1; b++) {
                if (ar[b] > ar[b + 1]) {
                    buf = ar[b];
                    ar[b] = ar[b + 1];
                    ar[b + 1] = buf;
                }
            }
        }
        for (int a : ar) {
            System.out.print(a + " ");
        }

    }
}