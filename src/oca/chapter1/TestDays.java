package oca.chapter1;

public class TestDays {
    static enum Days{ MON, TUE, WED};

    public static void main(String[] args) {
        for (Days d: Days.values()) {
            Days[] d2 = Days.values();
            System.out.println("d2 = " + d);
        }
    }
}
