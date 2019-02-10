package ocp.chapter5.locales;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
//        createLocale();
        createZooLocale();
    }

    private static void createLocale(){
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }

    private static void createZooLocale(){
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");
        List<Locale> locales = Arrays.asList(us, france, englishCanada, frenchCanada);
        System.out.println("locales = " + locales);
    }
}
