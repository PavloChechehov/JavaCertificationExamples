package ocp.chapter7.creationThread;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future result = service.submit(() -> 30 + 11);
            Future result1 = service.submit(() -> {throw new IOException();});

            service.submit(() -> {
                Thread.sleep(1000);
                return null;
            });
//            service.submit(() -> {Thread.sleep(1000);}); //NOT COMPILE,
// because Runnable interface method run doesn't throw exception

            //with Runnable interface
/*            Future result = service.submit(() -> {
                System.out.println("test");
            });*/
            System.out.println(result.get());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
