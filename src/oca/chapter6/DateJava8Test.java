package oca.chapter6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateJava8Test {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.toLocalTime());


        LocalDate date1 = LocalDate.of(2018, 1, 22);
        Period period1 = Period.ofMonths(1);
        System.out.println("date1 = " + date1);
        date1.plus(period1);
        System.out.println("date1 = " + date1);
        date1 = date1.plus(period1);
        System.out.println("date1 = " + date1);
    }
}
