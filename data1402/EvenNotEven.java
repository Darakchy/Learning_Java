package data1402;


public class EvenNotEven {
    public static void main(String[] args) {
        int[] ar = {122, 13, 15, 84, 9, 62, 7};
        ene(ar);
    }

    static void ene(int[] ar) {
        int bufEven = 0;
        int bufNotEven = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                bufEven += ar[i];
            } else bufNotEven++;
        }
        System.out.println("Сумма чётных чисел массива = " + bufEven);
        System.out.println("Колличество нечетных чисел массива = " + bufNotEven);
    }
}
