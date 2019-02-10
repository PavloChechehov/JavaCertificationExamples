package ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {
    public static void printList(List<Object> list) {
        for (Object x: list) System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //todo String put in Object Generic - compiler error
        //printList(keywords); // DOES NOT COMPILE

        testArrayAndGenerics();
    }

    public static void testConvertIntegerToObject(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        //List<Object> objects = numbers; // DOES NOT COMPILE
        //objects.add("forty two");
        //System.out.println(numbers.get(1));
    }


    // Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
    public static void testArrayAndGenerics(){
        Integer[] numbers = { new Integer(42)};
        //In that line we haven't compiler error - only compiler warning
        Object[] objects = numbers;
        objects[0] = "forty two";
    }
}
