package ocp.chapter4.streams;

import java.util.function.BooleanSupplier;

public class FunctionalBooleanInterface {
    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> {
            double random = Math.random();
            System.out.println("random = " + random);
            return random > .5;
        };
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());
    }
}
