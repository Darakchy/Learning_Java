package Func;

public class printN {
    public static void main(String[] args) {
        int n = 7;
        printN(n);
    }

    static void printN(int n) {
        int buf = 0;
        for (int i = 0; i < n; i++) {
            buf++;
            for (int j = 0; j < buf; j++) {
                System.out.print(buf);
            }
            System.out.print(" ");
        }
    }
}