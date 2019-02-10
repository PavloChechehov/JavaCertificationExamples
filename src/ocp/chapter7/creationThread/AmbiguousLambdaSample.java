package ocp.chapter7.creationThread;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambdaSample {
    public static void useCallable(Callable<Integer> expression) {
        try {
            expression.call();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
    public static void useSupplier(Supplier<Integer> expression) {}
    public static void use(Supplier<Integer> expression) {
        System.out.println("expression.get() = " + expression.get());
    }
    public static void use(Callable<Integer> expression) {
        try {
            System.out.println("expression.call() = " + expression.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        useCallable(() -> {throw new IOException("Hello message");}); // COMPILES
//        useSupplier(() -> {throw new IOException();}); // DOES NOT COMPILE
//        use(() -> {throw new IOException();}); // DOES NOT COMPILE
        use((Callable<Integer>) () -> {throw new IOException();});
        use((Supplier<Integer>) () -> 3);
    }
}
