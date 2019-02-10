package ocp.chapter7.creationThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationTask {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            service.submit(() -> {
                for (int i = 0; i < 500; i++) AwaitTerminationTask.counter++;
            });


        } finally {
            if (service != null) service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MILLISECONDS);

        // Check whether all tasks are finished
        if (service.isTerminated()) {
            System.out.println("All tasks finished");
        } else {
            System.out.println("At least one task is still running");
        }
    }
}
