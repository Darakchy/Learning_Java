package data1402;

public class NaturalNamber {
    public static void main(String[] args) {
        int n = 99;
        System.out.println(nn(n));
    }

    static boolean nn(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
