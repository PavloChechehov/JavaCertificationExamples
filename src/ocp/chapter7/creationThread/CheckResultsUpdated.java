package ocp.chapter7.creationThread;

import java.util.concurrent.*;

public class CheckResultsUpdated {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService service = null;
        try {

            service = Executors.newSingleThreadExecutor();

            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResultsUpdated.counter++;
            });

            result.get(1, TimeUnit.SECONDS);
            System.out.println("Reached!");

        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
