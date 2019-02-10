package oca.chapter6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DrWho {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate bday = null;

        try {
            bday = LocalDate.parse("12012016", f);
        } catch (DateTimeException e) {
            System.out.println("Bad time");
            System.exit(0);
        }

        System.out.println("your birthday is: " + bday);
        System.out.println("bday day of the week " + bday.getDayOfWeek());

        Period period = Period.between(bday, LocalDate.now());
        System.out.println("you're lived for: ");
        System.out.println(period.getDays() + " days, ");
        System.out.println(period.getMonths() + " months, ");
        System.out.println(period.getYears() + " years!");

        int yearsOld = period.getYears();
        if (yearsOld < 0 || yearsOld > 119 ){
            System.out.println("Wow, are you a Time Lord?");
        }

        long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("you're lived for " + tDays + " days, so far");
        System.out.println("you'll reach 30_000 days on " + bday.plusDays(30_000));

        LocalDate d2000 = LocalDate.of(2_000, 1, 1);
        Period period1 = Period.between(d2000, LocalDate.now());
        System.out.println("period since Y2K: " + period1);
    }
}
