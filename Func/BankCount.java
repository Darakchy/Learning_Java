package Func;

public class BankCount {
    public static void main(String[] args) {
        float p = 15f;
        int firstsum = 10000;
        int lastsum = 15000;
        System.out.print(months(p, firstsum, lastsum) + " ");
        System.out.println(finalsum(p, firstsum, lastsum));
    }

    static int months(float p, int firstsum, int lastsum) {
        int k = 0;
        for (int i = firstsum; i < lastsum; i += (i / 100 * p)) {
            k++;
        }
        return k;
    }

    static float finalsum(float p, int firstsum, int lastsum) {
        float st = firstsum;
        for (int i = 0; i < months(p, firstsum, lastsum); i++) {
            st += (st / 100 * p);
        }
        return st;
    }
}
