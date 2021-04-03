package Func;

public class Sort {
    public static void main(String[] args) {
        int[] ar = {5, 1, 2, 4, 3,12,17,-3};
        sort(ar);
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}