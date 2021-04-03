package Arrays;

import java.util.Scanner;

public class Ev3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];

        for (int s = 0; s < size; s++) {
            ar[s] = in.nextInt();
        }
        int num = 0;
        for (int a = 0; a < size; a++){
            if (Math.abs(ar[a]) % 10 == 1){
                num = num + 1;
                //num += 1     num++    ++num


            }
        }
        System.out.println(num);
    }
}
