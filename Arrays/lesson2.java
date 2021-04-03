package Arrays;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int s = 0; s < size; s++) {
            ar[s] = in.nextInt();
        }
        int num = 0;
        for (int i = 1; i < size; i++)
            if (ar[i] < ar[i - 1]) {
                num += 1;

            }
        System.out.println(num);
    }
}