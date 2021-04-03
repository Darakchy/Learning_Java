package data2302;

import java.util.Scanner;

public class ConvertingDecimalBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bin = "";
        int num = in.nextInt();
        while (num != 0) {
            int buf = num % 2;
            bin = buf + bin;
            num /= 2;
        }
        System.out.println(bin);
    }

}
