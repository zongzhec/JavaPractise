package zongzhe.java_basic.date_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZoneDemo {

    public static void main(String[] args) {
        checkAvailableZoneIds();
        convertTimeZone();
    }

    private static void convertTimeZone() {
        ZonedDateTime localTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime localTime: " + localTime); // 2020-04-01T19:28:21.477+08:00[Asia/Shanghai]

        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime nyTime: " + nyTime); // 2020-04-01T07:28:21.480-04:00[America/New_York]

        Clock c1 = Clock.systemDefaultZone();
        Clock c2 = Clock.system(ZoneId.of("America/New_York"));
        System.out.println("local clock: " + c1); // SystemClock[Asia/Shanghai]
        System.out.println("NY clock: " + c2); // SystemClock[America/New_York]
    }

    private static void checkAvailableZoneIds() {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneIds) {
            System.out.println("available zoneId: " + zoneId);
        }
    }
}
