package ocp.chapter5.locales;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantsClassTest {
    public static void main(String[] args) {
//        checkInstants();
//        plusWeekException();
        changeToOneHourToUpAndDown();
    }

    private static void checkInstants() {
        Instant now = Instant.now();
// do something time consuming
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

        System.out.println(later);
    }

    private static void plusWeekException(){
        Instant instant = Instant.now();
        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015–05–26T15:55:00Z
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour); // 2015–05–25T16:55:00Z
        //Todo Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Weeks
        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // exception
    }
    //another word this is Daylight Savings Time
    private static void changeToOneHourToUpAndDown(){
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]
    }
}
