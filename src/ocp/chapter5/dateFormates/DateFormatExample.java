package ocp.chapter5.dateFormates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        dateFormat();
    }

    private static void dateFormat() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));

    }
}
