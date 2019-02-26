package ocpTests.bonusTest1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q35_ConvertStringToInt {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2");

        IntStream intStream = stream.mapToInt(Integer::parseInt);
        intStream.forEach(System.out::print);;

//        Stream<Integer> is1 = stream.map(Integer::parseInt);
//        is1.forEach(System.out::print);
    }
}
