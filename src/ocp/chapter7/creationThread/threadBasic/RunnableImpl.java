package ocp.chapter7.creationThread.threadBasic;

public class RunnableImpl implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("Printing record: " + i);
    }

    public static void main(String[] args) {
        (new Thread(new RunnableImpl())).start();
    }
}
