package ocp.chapter7.creationThread;

public class CheckResults {
    private static int counter = 0;

/*    public static void main(String[] args) throws InterruptedException {
        new Thread(new CheckResults()).start();
        while (CheckResults.counter < 100) {
            System.out.println("current thread " + Thread.currentThread().getName());
            System.out.println("Not reached yet 100");
//            Thread.sleep(1000);
        }
        System.out.println("current thread " + Thread.currentThread().getName());

        System.out.println("Reached 400!");
    }*/

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                CheckResults.counter++;
            }
        }).start();
        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet");
        }
        System.out.println("Reached!");
    }

/*    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (i % 100 == 0) {
                System.out.println(CheckResults.counter);
            }
            CheckResults.counter++;
        }
    }*/
}
