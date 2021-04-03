package data1402;

public class NumberOfCoins {
    public static void main(String[] args) {
        int summ = 11;
        getFromATM(summ);
        System.out.println("--------------------");
        getFromATM2(summ);
    }

    static void getFromATM(int summ) {
        int[] ar = {1, 5, 10, 25, 50};
        int nom50 = summ / ar[4];
        int nom25 = (summ - ar[4] * nom50) / ar[3];
        int nom10 = (summ - ar[3] * nom25 - ar[4] * nom50) / ar[2];
        int nom5 = (summ - ar[2] * nom10 - ar[3] * nom25 - ar[4] * nom50) / ar[1];
        int nom1 = (summ - ar[1] * nom5 - ar[2] * nom10 - ar[3] * nom25 - ar[4] * nom50) / ar[0];

        System.out.println("Номинал 50 => " + nom50 + "\n" +
                "Номинал 25 => " + nom25 + "\n" +
                "Номинал 10 => " + nom10 + "\n" +
                "Номинал 5 => " + nom5 + "\n" +
                "Номинал 1 => " + nom1);
    }

    static void getFromATM2(int summ) {
        int[] ar = {1, 5, 10, 25, 50};
        for (int i = ar.length - 1; i >= 0; i--) {
            if (summ >= ar[i]) {
                System.out.println("Номинал " + ar[i] + " => " + (summ / ar[i]));
                summ -= ar[i] * (summ / ar[i]);
            }
        }
    }
}
