package ocp.chapter4.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.DoubleToIntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsWithPrimitives {
    public static void main(String[] args) {
//        mapToInt();
//        average();
//        infiniteStream();
//        printRangeOfInts();
//        intStreamFromStream();
//        methodForOptionalPrimitives();
//        System.out.println(summariesStatistic());
        doubleToInt();
    }

    private static void mapToInt() {
        //example 1
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

        //example 2
        stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum());
    }

    private static void average() {
        IntStream intStream = IntStream.of(1, 2, 3, 5);
        OptionalDouble average = intStream.average();
        System.out.println("average = " + average.getAsDouble());
    }


    private static void infiniteStream() {
        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);

    }

    private static void printRangeOfInts() {
        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);
        System.out.println();

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);
        System.out.println();

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());

    }

    private static void intStreamFromStream() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        IntStream ints = list.stream().flatMapToInt(x -> IntStream.of(x));
        ints.forEach(System.out::println);
    }

    private static void methodForOptionalPrimitives(){
        IntStream stream = IntStream.of(1, 2, 3);
        System.out.println(stream.average());


//        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
//        OptionalDouble min = doubles.min(); // runs infinitely
    }

    private static int summariesStatistic(){
        IntStream stream = IntStream.of(1, 2, 11);
        IntSummaryStatistics statistics = stream.summaryStatistics();
        if (statistics.getCount() == 0) {
            throw new RuntimeException();
        }

        System.out.println(statistics);
        return statistics.getMax() - statistics.getMin();

    }

    private static void doubleToInt(){
        double d = 2.0;
        DoubleToIntFunction f1 = x -> (int) x;
        System.out.println(f1.applyAsInt(d));

    }
}
