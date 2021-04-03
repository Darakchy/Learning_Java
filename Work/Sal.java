package Work;

import java.util.Scanner;

public class Sal {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите заработанную сумму: ");
        int sum = num.nextInt();
        System.out.print("Введите курс доллара: ");
        float rate = num.nextFloat();
        float sal = sum * rate;

        if (sal > 7000) System.out.println("На руки: " + (((sal - 7000) / 100 * 75) + 7000));
        else System.out.println("На руки: " + sal);

    }
}
