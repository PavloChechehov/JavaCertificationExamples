package ocp.chapter5.resourceExample;

import java.text.MessageFormat;
import java.util.*;

public class ZooOpen {
    public static void main(String[] args) {
//        Locale us = new Locale("en", "US");
//        Locale france = new Locale("fr", "FR");
//        printProperties(us);
//        System.out.println();
//        printProperties(france);
//        System.out.println();
//        Locale ua = new Locale("ua", "UA");
//        printProperties(ua);
//        Locale locale = Locale.getDefault();
//        printProperties(locale);
//        usePropertiesFile();

        orderToGetResourceFile();
    }

    private static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("ocp.chapter5.resourceExample.Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }

    private static void usePropertiesFile(){
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("ocp.chapter5.resourceExample.Zoo", us);
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);
        Properties props = new Properties();
        rb.keySet().stream()
                .forEach(k -> props.put(k, rb.getString(k)));

        System.out.println(props.getProperty("hello"));
    }
    
    private static void orderToGetResourceFile(){
        Locale locale = new Locale("en", "CA");
        //check as it will be in fr
//        Locale locale = new Locale("fr", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("ocp.chapter5.resourceExample.Zoo", locale);
//        String s = Arrays.toString(rb.keySet().toArray());
//        System.out.println("s = " + s);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitor"));
        System.out.println(" ");
        String format = rb.getString("helloByName");
        String formatted = MessageFormat.format(format, "Tammy", "Hi", "How are you?");
        System.out.print(formatted);
    }
    
}
