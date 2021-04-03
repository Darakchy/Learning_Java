package Func;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int[][] arrIn = new int[3][5];
        print(arrIn);
        fillArray(arrIn);
        print(arrIn);

    }

    static void fillArray(int arr[][]) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
    }
    static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
