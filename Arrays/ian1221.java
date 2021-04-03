package Arrays;

import java.util.Random;

public class ian1221 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 5;
        int[] ar = new int[size];
        int buf1 = 0;
        int buf2 = 1;
        for (int i = 0; i < size; i++) {
            ar[i] = random.nextInt(size);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            buf1 = buf1 + ar[i];
        }
        System.out.println("summ is " + buf1);

        for (int i = 0; i < size; i++) {
            buf2 = buf2 * ar[i];
        }
        System.out.println("product of numbers " + buf2);

    }

}

