package Arrays;

import java.util.Scanner;

public class Ev4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];

        for (int s = 0; s < size; s++) {
            ar[s] = in.nextInt();
        }
        for (int b = 0; b < size; b++) {
            System.out.print(ar[b] + " ");
        }
        System.out.println();

        int buf;
        for (int a = 0; a < size -1; a = a + 2) {
            buf = ar[a];
            ar[a] = ar[a + 1];
            ar[a + 1] = buf;
        }
        for (int b = 0; b < size; b++) {
            System.out.print(ar[b] + " ");
        }
    }
}