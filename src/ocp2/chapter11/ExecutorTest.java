package ocp2.chapter11;

import java.util.concurrent.Executor;

public class ExecutorTest {
    public static void main(String[] args) {
        Runnable task = new Task();
        System.out.println("Calling Task.run() by directly creating a Thread");
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Calling Task.run() by Executor");
        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(task, 3);
    }
}

// This Task class implements Runnable, so its a Thread object
class Task implements Runnable {
    static int i = 0;
    public void run() {
        System.out.println("Calling Task.run() " + ++i);
    }
}

// This class implements Executor interface and should override execute(Runnable) method.
// We provide an overloaded execute method with an additional argument 'times' to create and
// run the threads for given number of times
class RepeatedExecutor implements Executor {
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() %d times thro' Executor.execute() %n", times);
        for (int i = 0; i < times; i++) {
            execute(runnable);
        }
    }
}