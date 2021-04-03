package Func;

public class Cplusplus1 {
    public static void main(String[] args) {
        int min = min(34, 4);
        System.out.println(min);
        int min4 = min4(7, 20, 3, 8);
        System.out.println(min4);
    }

    static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    static int min4(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
}
