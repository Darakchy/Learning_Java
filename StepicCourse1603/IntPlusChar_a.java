package StepicCourse1603;

public class IntPlusChar_a {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(charExpression(n));
    }

    public static char charExpression(int a) {
        return (char) (a + '\\');
    }
}
