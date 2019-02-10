package ocp.chapter4.optional;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        System.out.println(average());

//        Optional<Double> average = average();
//        System.out.println("average.get() = " + average.get());

        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println);

    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
}
