package Arrays;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int s = 0; s < size; s++) {
            ar[s] = in.nextInt();
        }
        boolean isPresent = false;
        for (int s : ar) {
            if (s >= 10 && s <= 99 && s % 2 == 0) {
                System.out.print(s + " ");
                isPresent = true;
            }
        }
        if (isPresent == false) {
            System.out.println(-1);
        }
    }
}

