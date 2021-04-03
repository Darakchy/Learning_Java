package Func;

public class FireInForest {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int n = 4;
        int m = 5;
        int[][] ar = new int[n][m];
        fire_in(ar, x, y);
        fire_out(ar);

    }

    static int abs(int a) {
        if (a < 0) {
            return (-a);
        } else {
            return a;
        }
    }

    static int[][] fire_in(int[][] ar, int x, int y) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = abs(i - x) + abs(j - y) + 1;
            }
        }
        return ar;
    }

    static void fire_out(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}