package ocp.chapter4.reviewQuestons;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q17 {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;
        Function<Integer, Integer> f = x -> x*x;
    }
}
