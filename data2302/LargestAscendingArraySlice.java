package data2302;

import java.util.Scanner;

public class LargestAscendingArraySlice {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] ar = new int[N];
        int[] ar = {1, 2, 3, 1, 2, 5, 7, 1, 2, 1, 2};
//        for (int i = 0; i < N; i++) {
//            ar[i] = in.nextInt();
//        }

    }

    public static int[] arslice(int[] ar) {
        int n = 1;
        int[] arbuf = new int[n];
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                arbuf[0] = ar[i];
                n++;
            } else {
                n = 1;
            }
        }
        return arbuf;
    }
}
