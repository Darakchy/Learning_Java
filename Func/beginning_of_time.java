package Func;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class beginning_of_time {
    public static void main(String[] args) {
        long sec = System.currentTimeMillis() / 1000;
        System.out.println(LocalDateTime.ofEpochSecond(sec, 0, ZoneOffset.UTC));
        date(sec);
    }

    static boolean isLeapYear(long y) {
        return (y % 4 == 0 || y % 400 == 0) && y % 100 != 0;
    }

    static void date(long sec) {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long s = sec % 60;
        long min = sec / 60 % 60;
        long h = (sec / 3600) % 24;
        long totalDays = sec / (24 * 3600);
        long y = totalDays / 365;
        totalDays = totalDays - (y * 365);
        y = y + 1970;
        for (int i = 1970; i < y; i++) {
            if (isLeapYear(i)) {
                totalDays--;
            }
        }
        if (isLeapYear(y)) {
            months[2]++;
        }
        int m = 1;
        while (totalDays > months[m]) {
            totalDays = totalDays - months[m];
            m++;
        }
        System.out.printf("%04d-%02d-%02dT%02d:%02d:%02d", y, m, totalDays, h, min, s);
    }
}
