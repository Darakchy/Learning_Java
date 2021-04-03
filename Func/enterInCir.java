package Func;

public class enterInCir {
    public static void main(String[] args) {
        boolean ljb = eic(1,-1,1,1,2);
        if (ljb) {
            System.out.println("Yes");
        } else {
            System.err.println("No");
        }
    }

    static boolean eic(int x, int y, int xc, int yc, int r) {
        return (r * r) >= ((xc - x) * (xc - x) + (yc - y) * (yc - y));
    }
}