package forCheck;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ar = {1, 30, 24, 4, 8, 7, 6, 2, 50, 100};
        System.out.println(min(ar));
        System.out.println(max(ar));
        System.out.println(avg(ar));
    }

    public static int min(int[] ar) {
        int buf = Integer.MAX_VALUE;
        for (int i : ar) {
            if (i < buf && (i % 3 == 0 || i % 5 == 0)) {
                buf = i;
            }
        }
        return buf;
    }

    public static int max(int[] ar) {
        int buf = Integer.MIN_VALUE;
        for (int i : ar) {
            if (i > buf && (i % 3 == 0 || i % 5 == 0)) {
                buf = i;
            }
        }
        return buf;
    }

    public static int avg(int[] ar) {
        int bufcount = 0;
        int bufsumm = 0;
        for (int i : ar) {
            if (i % 3 == 0 || i % 5 == 0) {
                bufcount++;
                bufsumm += i;
            }
        }
        return bufsumm / bufcount;
    }
}
