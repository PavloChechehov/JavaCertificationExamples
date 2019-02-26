package ocpTests.bonusTest1;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q31 {
    public static void main(String[] args) {
        Stream<Integer> prime = Stream.of(2, 3, 5, 7);
        Stream<Integer> composite = Stream.of(4, 6, 8);
        ConcurrentMap<Boolean, List<Integer>> data = Stream.of(prime, composite)
                .flatMap(s -> s).parallel()
                .collect(Collectors.groupingByConcurrent(n -> (n % 2) == 0));
        System.out.println(data);
    }
}
