package com.company;

public class Kvadrat {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || (j + i) == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }

    }
}


