package ocp.chapter7.creationThread;

import java.util.Arrays;

public class TestReduceMethod {

    public static void main(String[] args) {
        ex3();
    }

    //could be parallelStream
    public static void ex1() {
        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
//                .parallelStream()
                .reduce("", (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3));

    }

    //bad reduce implementation
    public static void ex2() {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> {
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);
                    int i = a - b;
                    System.out.println("i = " + i);
                    return i;
                })); // NOT AN ASSOCIATIVE ACCUMULATOR

    }

    public static void ex3() {
        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .reduce("X", String::concat));
    }



}
