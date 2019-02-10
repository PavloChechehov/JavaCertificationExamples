package ocp.chapter5.reviewQuestions;

import java.time.LocalDate;
import java.time.Month;

public class Q8 {
    public static void main(String[] args) {
        //Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth()
                + " "+ date.getDayOfMonth());
    }
}
