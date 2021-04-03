package com.company;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n % 2) == 1) {
                    if (j == i || (j + i) == (n - 1) || j == (n / 2) || i == (n / 2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("- ");
                    }
                }
                if ((n % 2) == 0) {
                    if (j == i || (j + i) == (n - 1) || j == (n / 2) || i == (n / 2) || j == ((n / 2) - 1) || i == ((n / 2) - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("- ");
                    }
                }
            }System.out.println();
        }
    }
}
