package Func;

public class paint {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int z = 3;
        int p = 2;
        System.out.println(consum(x, y, z, p));
    }

    static int consum(int x, int y, int z, int p) {
        return ((x * y) + (y * z * 2) + (x * z * 2)) * p;
    }
}
