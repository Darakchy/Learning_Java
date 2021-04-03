package com.company;

import java.util.Scanner;

public class degrees90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int t = 10;
        int[][] ar = new int[n][m];
        int[][] ar90 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = t++;
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar90[j][i] = ar[n - 1 - i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar90[i][j] + " ");
            }
            System.out.println();
        }
    }
}
