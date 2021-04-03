package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line = "Maxim Darakchy";
        char [] arr = new char[20];
        int ll = line.length();
        line.getChars(0, ll, arr, 0);

        for (int i = 0; i < ll; i++){
            System.out.print(arr[i]);
        }
    }
}
