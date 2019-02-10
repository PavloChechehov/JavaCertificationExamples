package ocp.chapter3.methodReferences;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodRefTest {
    public static void main(String[] args) {
        Comparator<Duck> comparator = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        //this equal to
        Comparator<Duck> compareByWeight = DuckHelper::compareByWeight;

//        consumeMthodRef();
//        predicateMethodRef();
//        supplierMethodRef();
//        removeIf();
//        updateAll();
//        forEach();
        merge();

    }

    static void consumeMthodRef() {
        //example 1
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        //methodRef1.accept(list);
        lambda1.accept(list);

        System.out.println("list = " + list);
    }

    static void predicateMethodRef() {
        //example 2
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        System.out.println(methodRef2.test("a"));


        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        System.out.println(lambda3.test(""));
    }

    //Todo Constructor mewthod ref
    static void supplierMethodRef() {
        //example 3
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();
    }

    static void removeIf() {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]
    }

    static void updateAll() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x * 2);
        System.out.println(list); // [2, 4, 6]
    }

    static void forEach() {
        List<String> cats = Arrays.asList("Annie", "Ripley");
        for (String cat : cats)
            System.out.println(cat);
        //This works. We can do the same thing with lambdas in one line:
        cats.forEach(c -> System.out.println(c));
    }

    static void merge() {
        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        System.out.println("favorites = " + favorites);

        favorites.put("Sam", null);
        favorites.merge("Tom", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);

        System.out.println("favorites = " + favorites);


        mapper = (v1, v2) -> null;
        favorites = new HashMap<>();

        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        counts.computeIfPresent("Jenny", (k, v) -> null);
        counts.computeIfAbsent("Sam", k -> null);
        System.out.println(counts); // {}
    }
}
