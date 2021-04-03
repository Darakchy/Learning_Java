package Arrays;

import java.util.Scanner;

public class Ev1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int s = 0; s < size; s++) {
            arr[s] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int a = 0; a < size; a++) {
            if (arr[a] > 0) {
                if (arr[a] < min) {
                    min = arr[a];
                }
            }
        }
        System.out.println(min);

    }
}
