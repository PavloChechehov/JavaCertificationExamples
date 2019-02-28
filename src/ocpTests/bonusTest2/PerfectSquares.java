package ocpTests.bonusTest2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class PerfectSquares {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        IntStream intStream = IntStream.of(1, 4, 9, 16, 25);
        intStream.parallel() // z1
                .forEachOrdered(c -> service.submit(() -> {
                    int x = 10 * c;
                    System.out.println(x);
                    return x;
                })); // z3
        service.submit(() -> System.out.println("Complete!")); // z4
        service.shutdown();
    }
}
