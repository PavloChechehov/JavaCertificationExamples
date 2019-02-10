package ocp.chapter4.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SteamMainMethod {

    public static final String JSON_TEMPLATE = "{\n" +
            "  \"id\": 1,\n" +
            "  \"name\": \"Pasha\"\n" +
            "}\n";

    public static void main(String[] args) {
/*
count();
minAndMax();
findAnyAndFindFirst();
anyAllNoneMatch();
forEach();
reduce();
collect1();
collect2();
collectWithCollectors();
collectShortSet();
filter();
distinct();
limitAndSkip();
map();
flatMap();
sorted();
peek();
*/
//        peek2();
//        generate();

        testPeekOneMoreTime();
    }


    private static void count() {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(stream.count());
    }

    private static void minAndMax() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape
    }

    private static void findAnyAndFindFirst() {
        Stream<String> s = Stream.of("monkey", "asdasd", "asd asd", "asdasdas", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }

    private static void anyAllNoneMatch() {
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true

    }

    private static void forEach() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo
    }

    private static void reduce() {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        Optional<Integer> reduce = stream.reduce((i1, i2) -> i1 + i2);
        System.out.println(reduce.get());


        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
    }

    private static void collect1() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        System.out.println("word = " + word);
    }

    private static void collect2() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    private static void collectWithCollectors() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println("set = " + set);
    }

    private static void collectShortSet() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println("set = " + set);
    }

    private static void filter() {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        stream.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }

    private static void distinct() {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo", "bonobo", "bonobo");
        stream.distinct().forEach(System.out::print);
    }

    private static void limitAndSkip() {
        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);
        iterate.skip(5).limit(2).forEach(System.out::println);
    }

    private static void map() {
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        stream.map(String::length).forEach(System.out::println);
    }

    private static void flatMap() {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Monkey", "Makaka");
        Stream<List<String>> stream = Stream.of(zero, one, two);

        stream.flatMap(l -> l.stream()).forEach(System.out::println);
    }

    private static void sorted() {

        Stream<String> stream = Stream.of("brown-", "bear-");
        stream.sorted().forEach(System.out::println);

        Stream<String> stream1 = Stream.of("brown bear-", "grizzly-");
        stream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void peek() {
        //example 1
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count);

    }

    private static void peek2() {
        //example 2
        List<Integer> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream = Stream.of(numbers, letters);
//        stream.map(List::size).forEach(System.out::print);

        StringBuilder builder = new StringBuilder();
        Stream<List<?>> good = Stream.of(numbers, letters);
        good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::println); // 11
        System.out.println(builder); // [1][a]

        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print); // 00

    }

    private static void generate() {
        Stream.generate(() -> "something bad")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }

    private static void testPeekOneMoreTime() {
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);
    }



}
