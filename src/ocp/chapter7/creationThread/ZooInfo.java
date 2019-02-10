package ocp.chapter7.creationThread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            //1
            service.execute(() -> System.out.println("Printing zoo inventory"));
            //2
            service.execute(() ->
                    {
                        for (int i = 0; i < 5; i++)
                            System.out.println("Printing record: " + i);
                    }
            );

            //3
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
            System.out.println("service shutdown = " + service.isShutdown());

            List<Runnable> runnables = service.shutdownNow();
            System.out.println(runnables);
        } finally {
            if (service != null) service.shutdown();
            System.out.println("service shutdown = " + service.isShutdown());
            System.out.println("service terminated = " + service.isTerminated());
            System.out.println("Available process: " + Runtime.getRuntime().availableProcessors());
        }
    }
}
