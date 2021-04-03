package Arrays;

import java.util.Scanner;

public class array1d {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 11, 1};
        int buf = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > buf){
                buf = arr[i];
            }
        }
        System.out.println(buf);
    }
}
