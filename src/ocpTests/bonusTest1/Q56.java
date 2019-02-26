package ocpTests.bonusTest1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q56 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("bull", "cow");
        Map<Boolean, List<String>> c = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
        System.out.println("c = " + c);
    }
}
