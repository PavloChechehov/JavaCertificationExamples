package ocp.chapter5.reviewQuestions;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q10AndQ11 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        formatFromLocalDateTime(d);
        formatFromDateTimeFormatter(d);
        q11check();
        
    }


    private static void formatFromDateTimeFormatter(LocalDateTime d){
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("f.format(d) = " + f.format(d));
    }

    private static void formatFromLocalDateTime(LocalDateTime d){
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("d.format(f) = " + d.format(f));
    }
    
    private static void q11check(){
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
