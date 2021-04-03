package test;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + (num1 * num2 * num3));
        System.out.println("(" + num1 + " + " + num2 + ")" + " * " + num3 + " = " + ((num1 + num2) * num3));
    }
}
