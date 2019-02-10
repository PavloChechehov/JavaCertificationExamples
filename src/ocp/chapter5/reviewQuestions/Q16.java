package ocp.chapter5.reviewQuestions;

import java.time.*;

public class Q16 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        long epochSeconds = 0;
        Instant instant = Instant.ofEpochMilli(epochSeconds);
        System.out.println("instant = " + instant);
    }
}
