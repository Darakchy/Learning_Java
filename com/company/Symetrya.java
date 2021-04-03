package com.company;

public class Symetrya {
    public static void main(String[] args) {
        int[][] ar = new int[][]{
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        int buf = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] != ar[j][i]) {
                    buf++;
                }
            }
        }
        if (buf > 0) {
            System.out.println("NO");
        } else System.out.println("YES");
    }
}
