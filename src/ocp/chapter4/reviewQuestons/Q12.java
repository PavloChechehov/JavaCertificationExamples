package ocp.chapter4.reviewQuestons;

import ocp.chapter2.FunctionInterface;

import java.util.function.*;

public class Q12 {
    public static void main(String[] args) {
        Consumer<String> consumer = String::new;
        Supplier supplier = () -> "a";


        Supplier<String> x = String::new;
        BiConsumer<String, String> y = (a, b) -> System.out.println();
//        BiFunction<String, String, String> z = (a,s)-> a + a;
        UnaryOperator<String> z = a-> a + a;

    }
}
