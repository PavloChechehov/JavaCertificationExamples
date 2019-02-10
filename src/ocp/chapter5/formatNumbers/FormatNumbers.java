package ocp.chapter5.formatNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String[] args) {
//        numbersFormatDependFromCountry();
//        currencyDependFromRegion();
//        numberFormatParse();
        dateWithDateFormatter();
    }
    
    private static void numbersFormatDependFromCountry() {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
    } 
    
    private static void currencyDependFromRegion(){
        double price = 48;
        NumberFormat us = NumberFormat.getCurrencyInstance();
        System.out.println(us.format(price));
    }
    
    private static void numberFormatParse(){
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        try {
            System.out.println(nf.parse(one)); // 456
            System.out.println(nf.parse(two)); // -2.5165
            System.out.println(nf.parse(three));// throws ParseException
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void dateWithDateFormatter(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
//        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
    }

}
