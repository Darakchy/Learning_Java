package Arrays;

public class Steps {
    public static void main(String[] args) {
        int n = 6;
        steps(n);
    }

    static void steps(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
