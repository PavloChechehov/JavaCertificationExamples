package ocp.chapter4.reviewQuestons;

import java.util.stream.DoubleStream;

public class Q18 {
    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        System.out.println(s.peek(System.out::println).filter(x -> x > 2).count());

    }
}
