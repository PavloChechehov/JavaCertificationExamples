package ocp.chapter6.asserts;

public class AssertsTest {
    public static void main(String[] args) {
        int numGuests = -5;
        assert numGuests > 0;
        System.out.println(numGuests);
    }
}
