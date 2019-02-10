package ocp.chapter7.creationThread;

public class MainRunnable {

    public static void main(String[] args) {
        Runnable hello_world = () -> System.out.println("Hello World");
        Runnable r1 = () -> {
            int i = 10;
            i++;
        };
        Runnable r2 = () -> {
            return;
        };

        Runnable r3 = () -> {};


        Thread thread = new Thread(hello_world);
        System.out.println(thread.getName());
        thread.start();



    }
}
