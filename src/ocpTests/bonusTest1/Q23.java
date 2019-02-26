package ocpTests.bonusTest1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q23 {
    public static void main(String[] args) {
        Arrays.asList(0,1,2).forEach(System.out::print);
        System.out.println();
        Arrays.asList(0,1,2).stream().forEach(System.out::print);
        System.out.println();
        IntStream.range(0,3).forEach(System.out::print);
        IntStream.range(0,3).forEach(System.out::print);
    }
}
