package ocp.chapter6.reviewQuestion;

public class Q2 implements AutoCloseable{
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
    public static void main(String[] args) throws Exception {
        try (Q2 t = new Q2()) {
            System.out.println("put turkeys in");
        }
    }
}
