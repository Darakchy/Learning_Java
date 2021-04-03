package test;

public class ProhodFiguri {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int a = 2;
        int b = 2;
        int c = 5;
        in(x, y, a, b, c);
    }

    static void in(int x, int y, int a, int b, int c) {
        if ((a <= x || a <= y) && (b <= x || b <= y)) {
            System.out.println("Yes");
        } else if ((c <= x || c <= y) && (b <= x || b <= y)) {
            System.out.println("Yes");
        } else if ((c <= x || c <= y) && (a <= x || a <= y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
