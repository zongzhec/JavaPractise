package zongzhe.java_basic.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter d1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter d2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter d3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(d1.format(today)); // 2020年4月1日 星期三
        System.out.println(d2.format(today)); // 2020-4-1
        System.out.println(d3.format(today)); // 20-4-1
        System.out.println(d4.format(today)); // 2020-04-01
    }
}
