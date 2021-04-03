package L2;

import java.io.IOException;
import java.util.Scanner;

public class L25 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int res1 = num1 / num2;
        int res2 = num1 % num2;
        System.out.print(res1 + " " + res2);
    }
}