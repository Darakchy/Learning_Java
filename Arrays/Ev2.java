package Arrays;

import java.util.Scanner;

public class Ev2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int s = 0; s < size; s++) {
            arr[s] = in.nextInt();
        }
        int max = 1;
        for (int a = 0; a < size; a++) {
            if (arr[a] > 0) {
                if (arr[a] % 2 == 0) {
                    if (arr[a] > max) {
                        max = arr[a];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
