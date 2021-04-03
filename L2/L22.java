package L2;

import java.io.IOException;
import java.util.Scanner;

public class L22 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long res = (num1 + 2) / 3;
        System.out.println(res);
    }
}
