package com.company;

import java.util.Random;

public class G170121 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 3;
        int m = 5;
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = random.nextInt(200);
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int temp = 0;
        int temp3 = 0;
        for (int i = 0; i < n; i++) {
            int temp2 = 0;
            for (int j = 0; j < m; j++) {
                if (ar[i][j] / 10 < 10 && ar[i][j] / 10 > 0) {
                    if ((ar[i][j] / 10 + ar[i][j] % 10) % 2 == 0) {
                        temp3++;
                    }
                    temp2++;
                    System.out.print(ar[i][j] + " ");
                }
            }
            temp += temp2;
            System.out.println(" - Количество двузначных чисел: " + temp2);
        }
        System.out.println("Общее количество двузначных чисел: " + temp);
        System.out.println("Kоличество всех двухзначных чисел, у которых сумма цифр кратная 2: " + temp3);
    }
}
