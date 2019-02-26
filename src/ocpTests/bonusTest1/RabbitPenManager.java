package ocpTests.bonusTest1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class RabbitPenManager {
    public static void await(CyclicBarrier cb) { // k1
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2, () -> System.out.println("Pen is Full")); // k2
        IntStream.iterate(1, i -> 1)
                .limit(2)
                .forEach(i -> await(cb)); // k3
    }
}
