package ocpTests.bonusTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class ContestApp {
    public static Object trackParticipants(int count) {
// IMPLEMENTATION OMITTED
    }

    public static void viewWinners(Future<?> f) {
        try {
            System.out.println(f.get(100)); // a1
        } catch (Exception e) {
            System.out.println("No Winner");
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<Future<?>>();
        IntStream.range(100, 105)
                .forEach(i -> results.add(
                        service.submit(p -> trackParticipants(i)))); // a2
        results.stream().forEach(f -> viewWinners(f));
        service.shutdown();
    }
}
