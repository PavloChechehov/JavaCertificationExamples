package ocp.chapter7.creationThread.threadBasic;

public class ThreadExt extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        System.out.println("begin");
        (new ThreadExt()).start();
        (new Thread(new RunnableImpl())).start();
        (new ThreadExt()).start();
        System.out.println("end");

    }
}
