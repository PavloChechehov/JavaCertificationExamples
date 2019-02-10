package ocp.chapter6.reviewQuestion;

import java.io.Closeable;

public class Q5 {
    static class Door implements AutoCloseable {
        public void close() {
            System.out.print("D");
        }
    }

    static class Window implements Closeable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try (Door d = new Door(); Window w = new Window()) {
            System.out.print("T");
        } catch (Exception e) {
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("throwable = " + throwable.getMessage());
            }
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
