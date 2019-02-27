package ocpTests.bonusTest1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class RabbitPenManager {
    public static void await(CyclicBarrier cb) { // k1
        try {
            System.out.println("before await");
            cb.await();
            System.out.println("after await");
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(4, () -> System.out.println("Pen is Full")); // k2
        IntStream.iterate(1, i -> 1)
                .parallel()
                .limit(4)
                .forEach(i -> { await(cb);}); // k3
    }
}
