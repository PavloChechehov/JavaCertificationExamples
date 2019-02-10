package ocp.chapter4.functionalIntefaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
//        supplierWithLocalDay();
//        supplierWithStrBuilder();
//        supplierWithArrayList();
//        consumerFuncInterface();
//        biConsumerFuncInterface();
//        predicate();
//        biPredicate();
//        function();
//        biFunction();
        unaryOperator();
    }


    static void supplierWithLocalDay() {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);

    }

    static void supplierWithStrBuilder() {
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder("sd");
        System.out.println("s1.get() = " + s1.get());
        System.out.println("s2.get() = " + s2.get());
    }

    static void supplierWithArrayList() {
        Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
        ArrayList<String> a1 = s1.get();
        System.out.println(a1);
        System.out.println("s1 = " + s1);
    }

    static void consumerFuncInterface() {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");
    }

    static void biConsumerFuncInterface() {
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);

    }

    static void predicate() {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        Predicate<String> p3 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 2;
            }
        };
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
        System.out.println("p3.test(\"go\") = " + p3.test("go"));
    }

    static void biPredicate() {
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
    }

    static void function() {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5
    }

    static void biFunction() {
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }

    static void unaryOperator(){
        UnaryOperator<String> u1 = String::toLowerCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("ChIrp"));
        System.out.println(u2.apply("chirp"));
    }

    static void binaryOperator() {
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
