package ocp.chapter3.reviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q9 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("pi", 3.14159);
//        map.put("e", 2L);
        map.put("log(1)", new Double(0.0));
//        map.put('x', new Double(123.4));
        System.out.println("map = " + map);
    }

}
