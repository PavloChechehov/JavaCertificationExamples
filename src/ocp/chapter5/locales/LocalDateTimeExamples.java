package ocp.chapter5.locales;

import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
//        dateAndTimeClass();
//        timeZone();
//        filterTimeZone();
//        manipulateWithDate();
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//        performAnimalEnrichment(start, end);
//        periodMethod();
        durationMethod();
        durationMethodWithChronoUnit();
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    private static void dateAndTimeClass() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }

    private static void timeZone() {
        ZoneId zoneId = ZoneId.of("US/Hawaii");
        System.out.println(zoneId);
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), zoneId));

        System.out.println(ZonedDateTime.now().getDayOfWeek());
        System.out.println(ZoneId.getAvailableZoneIds());
    }

    private static void filterTimeZone() {
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US"))
                .sorted().forEach(System.out::println);
    }

    private static void manipulateWithDate() {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014–01–20
        date = date.plusDays(2);
        System.out.println(date); // 2014–01–22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014–01–29
        date = date.plusMonths(1);
        System.out.println(date); // 2014–02–28
        date = date.plusYears(5);
        System.out.println(date); // 2019–02–28
    }

    private static void periodMethod(){
        System.out.println(Period.of(1,2,3));
        System.out.println(Period.ofYears(1));                    // every 1 year
        System.out.println(Period.ofMonths(3));                   // every 3 months
        System.out.println(Period.ofWeeks(3));                    // every 3 weeks
        System.out.println(Period.ofDays(2));                     // every 2 days
        System.out.println(Period.of(1, 0, 7)); // every year and 7 d

        System.out.println(Period.ofYears(1).ofWeeks(1));
    }

    private static void durationMethod(){
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        System.out.println("daily = " + daily);
        System.out.println("hourly = " + hourly);
        System.out.println("everyMinute = " + everyMinute);
        System.out.println("everyTenSeconds = " + everyTenSeconds);
        System.out.println("everyMilli = " + everyMilli);
        System.out.println("everyNano = " + everyNano);

        System.out.println(Duration.ofSeconds(3600));

    }

    private static void durationMethodWithChronoUnit(){
        Duration daily = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano = Duration.of(1, ChronoUnit.NANOS);

        System.out.println("daily = " + daily);
        System.out.println("hourly = " + hourly);
        System.out.println("everyMinute = " + everyMinute);
        System.out.println("everyTenSeconds = " + everyTenSeconds);
        System.out.println("everyMilli = " + everyMilli);
        System.out.println("everyNano = " + everyNano);
    }

    private static void chronoEnumMethod(){
        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
    }

}
