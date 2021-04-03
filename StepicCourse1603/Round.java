package StepicCourse1603;

public class Round {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        double pow = Math.pow(10, 4);
        double round = Math.round((a + b) * pow) / pow;
        System.out.println(round);
        System.out.println(doubleExpression(a, b, c));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        boolean temp = false;
        double pow = Math.pow(10, 4);
        double round = Math.round((a + b) * pow) / pow;
        if (c == round) {
            temp = true;
        }
        return temp;
    }
}
