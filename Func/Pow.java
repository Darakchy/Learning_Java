package Func;

public class Pow {
    public static void main(String[] args) {
        int pow = pow(-3, 4);
        System.out.println(pow);
    }

    static int pow(int a, int n) {
        if (n == 0) return 1;
        return a * pow(a, n - 1);
    }
}
