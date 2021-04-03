package data1402;

public class Factorial {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int buf = 1;
        for (int i = 1; i <= n; i++) {
            buf *= i;
        }
        return buf;
    }
}
