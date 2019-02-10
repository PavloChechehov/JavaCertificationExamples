package ocp.chapter4.reviewQuestons;

import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("-", (s) -> s + "1");
        stream.limit(2).map(x -> x + "2").forEach(System.out::println);
    }
}
