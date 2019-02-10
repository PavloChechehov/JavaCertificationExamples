package ocp.chapter5.reviewQuestions;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q5 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("ocp.chapter5.reviewQuestions.Dolphins", fr);
        System.out.println(b.getString("name"));
        //todo age in Dolphins_fr doesn't exist that why app will use Dolphins.properties - default properties
        System.out.println(b.getString("age"));
    }
}
