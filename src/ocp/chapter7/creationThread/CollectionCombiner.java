package ocp.chapter7.creationThread;


import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

public class CollectionCombiner {

    public static void main(String[] args) {

        ex2();
    }

    public static void setAddAll() {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.
                collect(
                        () -> new ConcurrentSkipListSet<String>(),
                        (strings, e) -> strings.add(e),
                        (strings, c) -> strings.addAll(c)
                );
        System.out.println(set); // [f, l, o, w]
    }

    public static void ex2() {
        int i = 1;
        do {
            while (i < 1) System.out.println("i = " + i);
        } while (i > 1);
    }
}