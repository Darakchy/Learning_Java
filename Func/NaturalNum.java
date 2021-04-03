package Func;

public class NaturalNum {
    public static void main(String[] args) {
        int num = MinDivisor(23);
        System.out.println(num);
    }

    static int MinDivisor(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
