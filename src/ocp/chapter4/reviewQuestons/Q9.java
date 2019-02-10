package ocp.chapter4.reviewQuestons;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Q9 {
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();

        opt.ifPresent(System.out::println);

        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }
    }
}
