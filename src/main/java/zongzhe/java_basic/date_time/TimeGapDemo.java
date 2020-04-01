package zongzhe.java_basic.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TimeGapDemo {
    public static void main(String[] args) {
        calTimeGapForDate();
        valTimeGapForTime();
    }

    private static void valTimeGapForTime() {
        // Duration 表示时间间隔
        LocalTime now = LocalTime.now();
        LocalTime midNight = LocalTime.MIDNIGHT;
        Duration duration = Duration.between(now, midNight);
        System.out.println("Duration.between: " + duration); // PT-19H-39M-28.334S

    }

    private static void calTimeGapForDate() {
        // Period 表示日期间隔
        LocalDate today = LocalDate.now();
        LocalDate anotherDate = LocalDate.of(1990, 1, 2);
        Period period = Period.between(today, anotherDate);
        System.out.println("Period.between: " + period); // P-30Y-2M-30D
    }
}
