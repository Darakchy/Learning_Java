package StepicCourse1603;

public class TrueTrueFalseFalse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        System.out.println(booleanExpression(a, b, c, d));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean temp = false;
        if ((a & b & (!c) & (!d)) ^ (a & (!b) & c & (!d)) ^ (a & (!b) & (!c) & d) ^ ((!a) & b & c & (!d)) ^
                ((!a) & (!b) & c & d) ^ ((!a) & b & (!c) & d)) {
            temp = true;
        }
        return temp;
    }
}

