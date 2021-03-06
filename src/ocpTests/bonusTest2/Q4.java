package ocpTests.bonusTest2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q4 {
    //todo concurrency
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<?> f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Frog");
                } // h1
            }
        });
        Future<?> f2 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Toad");
                } // h2
            }
        });
        f1.get();
        f2.get();
        service.shutdown();
    }
}
