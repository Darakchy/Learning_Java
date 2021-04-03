package StepicCourse1603;

public class bitShift {
    public static void main(String[] args) {
        int value = 10;
        int bitindex = 3;
        System.out.println(flipBit(value, bitindex));
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ 1 << (bitIndex - 1);
    }
}
