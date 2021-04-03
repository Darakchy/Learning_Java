package Func;

public class enterInSq {
    public static void main(String[] args) {
        boolean ljb = eis(1, -655, 7);
        if (ljb) {
            System.out.println("Yes");
        } else {
            System.err.println("No");
        }
    }

    static int abs(int a) {
        if (a < 0) {
            return (a * -1);// или return -a
        } else {
            return a;
        }
    }

    static boolean eis(int x, int y, int s) {
        return abs(x) <= s && abs(y) <= s;

    }
}