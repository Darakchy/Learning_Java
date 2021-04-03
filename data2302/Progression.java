package data2302;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long buf = 0;
        for (int i = 1; i <= n; i++) {
            buf +=i;
        }
        System.out.println(buf);
    }
}
