package com.company;

public class glavnaya_diagonali {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i > j ){
                    System.out.print((i - j) + " ");
                }
                else System.out.print((j - i) + " ");
//                System.out.print(Math.abs(i - j));
            }
            System.out.println();
        }
    }
}
