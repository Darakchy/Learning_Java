package com.company;

import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        int n = 6;
        int m = 5;
        int t = 1;
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 1) {
                    ar[i][m - 1 - j] = t++;
                } else {
                    ar[i][j] = t++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
