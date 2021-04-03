package Func;

public class Time {
    public static void main(String[] args) {
        int sec = 100000;
        time(sec);
    }

    static void time(int sec) {
        int h = sec / 3600 % 24;
        int m = (sec % 3600) / 60;
        int s = sec % 60;
        System.out.printf("%02d : %02d : %02d", h, m, s);
    }
}
