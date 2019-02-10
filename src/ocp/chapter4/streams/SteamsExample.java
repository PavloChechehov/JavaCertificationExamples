package ocp.chapter4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamsExample {
    public static void main(String[] args) {

//        creatingStream();
//        streamParallelTest();
//        streamWithMathFunc();
    }

    private static void creatingStream() {
        Stream<String> empty = Stream.empty();
        Stream<Integer> one = Stream.of(1);
        Stream<Integer> three = Stream.of(1, 2, 3);


        System.out.println("empty = " + empty);
        System.out.println("one = " + one);
        System.out.println("three = " + three);

        System.out.println(empty.count());
        System.out.println(one.count());
        System.out.println(three.count());

    }

    private static void streamParallelTest() {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        System.out.println(Arrays.toString(fromList.toArray()));
        System.out.println(Arrays.toString(fromListParallel.toArray()));
    }

    private static void streamWithMathFunc() {
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 1);

//        System.out.println(randoms.findAny());
//        System.out.println(oddNumbers.findAny());
        //scary thing - please don't run - infinite loop without limit(10)
//        randoms.limit(5).forEach(System.out::println);
        oddNumbers
                .limit(12)
                .filter(n -> n < 15)
                .forEach(System.out::println);

    }

}
