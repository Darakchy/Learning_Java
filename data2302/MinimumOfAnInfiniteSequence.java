package data2302;

import java.util.Scanner;

public class MinimumOfAnInfiniteSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int enter;
        int min = Integer.MAX_VALUE;
        while (in.hasNext()) {
            enter = in.nextInt();
            if (enter < min) {
                min = enter;
            }
        }
        System.out.print(min + " ");
    }
}

