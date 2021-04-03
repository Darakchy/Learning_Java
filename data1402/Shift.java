package data1402;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int numShift = 2;
        System.out.println(Arrays.toString(shift(ar, numShift)));
    }

    static int[] shift(int[] ar, int num) {
        int[] ar2 = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
             ar2[(i + num) % ar.length] = ar[i];
        }
        return ar2;
    }
}
