package Func;

public class ABS {
    public static void main(String[] args) {
        int abs = abs(5);
        System.out.println(abs);
    }

    static int abs(int a) {
        if (a < 0) {
            return (a * -1);// или return -a
        } else {
            return a;
        }
    }
}
