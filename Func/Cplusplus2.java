package Func;

public class Cplusplus2 {
    public static void main(String[] args) {
        double dist = dist(0, 0, 1, 1);
        System.out.println(dist);
    }

    static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
