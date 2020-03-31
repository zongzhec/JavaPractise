package zongzhe.java_basic.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        dateGOne();
        dateGTwo();
        dateFormat();

    }

    // 第一代：java.util.Date
    static void dateGOne() {
        Date now = new Date();
        System.out.println("new Date(): " + now); // Tue Mar 31 16:35:59 CST 2020

        long time = now.getTime();
        System.out.println("getTime()： " + time); // 1585643893232

        Date dateFromMilliSeconds = new Date(time);
        System.out.println("new Date(time): " + dateFromMilliSeconds); // Tue Mar 31 16:39:49 CST 2020

        Date maxDate = new Date(Long.MAX_VALUE);
        System.out.println("new Date(Long.MAX_VALUE): " + maxDate); // Sun Aug 17 15:12:55 CST 292278994

    }

    // 第二代：java.util.Calendar
    public static void dateGTwo(){
        Calendar c = Calendar.getInstance(); // 用默认的语言环境和时区, 当前时间 Tue Mar 31 16:35:59 CST 2020

        System.out.println("Calendar.YEAR: " + c.get(Calendar.YEAR)); // 2020
        System.out.println("Calendar.MONTH: " + c.get(Calendar.MONTH)); // 2, 月份从0开始算
        System.out.println("Calendar.DAY_OF_MONTH: " + c.get(Calendar.DAY_OF_MONTH)); // 31
    }


    public static void dateFormat() throws ParseException {
        String str = "2020-03-31 17:17:17.177";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date dateFromStr = sdf.parse(str);
        System.out.println("SimpleDateFormat.parse: " + dateFromStr); // Tue Mar 31 17:17:17 CST 2020

        Date date = new Date();
        String strFromDate = sdf.format(date);
        System.out.println("SimpleDateFormat.format: " +strFromDate); // 2020-03-31 17:23:09.810
    }
}
