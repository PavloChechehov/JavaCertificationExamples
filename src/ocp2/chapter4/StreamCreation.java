package ocp2.chapter4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(new Integer[]{1, 2, 3, 4, 5});

        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();


        IntStream.rangeClosed(0, 10)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }
}
