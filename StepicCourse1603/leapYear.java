package StepicCourse1603;

public class leapYear {
    public static void main(String[] args) {
        int year = 3;
        System.out.println(leapYearCount(year));
    }

    public static int leapYearCount(int year) {
        int fourYears = year / 4;
        int oneHundredYears = year / 100;
        int fourHundredYears = year / 400;
        return fourYears - oneHundredYears + fourHundredYears;
    }
}

