package data2302;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(long num) {
        boolean buf = true;
        if (num < 2) {
            buf = false;
        }else {
            for (long i = 2; i < num; i++) {
                if (num % i == 0){
                    buf = false;
                }
            }
        }
        return buf;
    }
}
