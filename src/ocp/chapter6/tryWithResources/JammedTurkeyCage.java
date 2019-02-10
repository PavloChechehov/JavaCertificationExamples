package ocp.chapter6.tryWithResources;

public class JammedTurkeyCage implements AutoCloseable {
    public void close() throws IllegalStateException{
        throw new IllegalStateException("1 Cage door does not close");
    }
    public static void main(String[] args) {
//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            System.out.println("2 put turkeys in");
//        } catch (IllegalStateException e) {
//            System.out.println("3 caught: " + e.getMessage());
//        }

        example1();
//        example2();
//        example3();

        example4();
    }

    private static void example1(){
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("4 turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("5 caught: " + e.getMessage());
            for (Throwable t: e.getSuppressed())
                System.out.println(t.getMessage());
        }
    }

    private static void example2(){
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new RuntimeException("6 turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("7 caught: " + e.getMessage());
        }

    }

    private static void example3(){
        try (JammedTurkeyCage t1 = new JammedTurkeyCage();
             JammedTurkeyCage t2 = new JammedTurkeyCage()) {
            System.out.println("turkeys entered cages");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            for (Throwable t: e.getSuppressed())
                System.out.println(t.getMessage());
        }
    }

    private static void example4(){
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }
    }
}
