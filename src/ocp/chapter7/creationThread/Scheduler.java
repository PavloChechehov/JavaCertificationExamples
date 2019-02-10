package ocp.chapter7.creationThread;

import java.util.List;
import java.util.concurrent.*;

public class Scheduler {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> {
//            System.out.println("Monkey");
//            return null;
            return "Monki";
        };
        Future<?> result1 = service.schedule(task1, 2, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 3, TimeUnit.SECONDS);

        boolean isShutdown = service.isShutdown();
        System.out.println("Service is shutdown? " + isShutdown);

        System.out.println("Is done? " + result2.isDone());
        System.out.println("Get:  " + result2.get(4, TimeUnit.SECONDS));

        if (!service.isShutdown()) {
            service.shutdown();
        }

        System.out.println("Service is shutdown? " + service.isShutdown());

    }
}
