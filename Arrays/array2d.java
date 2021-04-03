package Arrays;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array2d = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2d[i][j] = in.nextInt();
            }
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array2d[i][j]);
//            }
//        }
        int buf = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array2d[i][j] > buf) {
                    buf = array2d[i][j];
                }
            }
        }
        System.out.println(buf);
    }
}

