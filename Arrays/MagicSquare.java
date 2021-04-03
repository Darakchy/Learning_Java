package Arrays;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] ms = {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}};
        System.out.println(isMS(ms));
    }
    static boolean isMS(int [][] ms){
        return uniqueness(ms) && horizontal(ms) && vertical(ms) && diagonalLR(ms) && diagonalRL(ms);
    }

    static boolean uniqueness(int[][] ms) {
        for (int i = 0; i < ms.length; i++) {
            for (int j = 0; j < ms[i].length; j++) {
                for (int k = 0; k < ms.length; k++) {
                    for (int l = 0; l < ms[i].length; l++) {
                        if (i != k || j != l) {
                            if (ms[i][j] == ms[k][l]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    static boolean horizontal(int[][] ms) {
        for (int i = 0; i < ms.length; i++) {
            int buf = 0;
            for (int j = 0; j < ms[i].length; j++) {
                buf += ms[i][j];
            }
            if (buf != 15) {
                return false;
            }
        }
        return true;
    }

    static boolean vertical(int[][] ms) {
        for (int i = 0; i < ms.length; i++) {
            int buf = 0;
            for (int j = 0; j < ms[i].length; j++) {
                buf += ms[j][i];
            }
            if (buf != 15) {
                return false;
            }
        }
        return true;
    }

    static boolean diagonalRL(int[][] ms) {
        int buf = 0;
        for (int i = 0; i < ms.length; i++) {
            buf += ms[i][i];
        }
        return buf == 15;
    }

    static boolean diagonalLR(int[][] ms) {
        int buf = 0;
        for (int i = 0; i < ms.length; i++) {
            buf += ms[i][ms.length - 1 - i];
        }
        return buf == 15;
    }
}

