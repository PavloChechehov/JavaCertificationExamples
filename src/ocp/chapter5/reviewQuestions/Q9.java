package ocp.chapter5.reviewQuestions;

import java.time.LocalDate;
import java.time.Month;

public class Q9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        LocalDate localDate = date.plusDays(2);
        LocalDate localDate1 = localDate.plusYears(3);
        System.out.println(localDate1.getYear() + " "
                + localDate1.getMonth() + " "+ localDate1.getDayOfMonth());
    }
}
