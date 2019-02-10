package ocp.chapter4.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class UnderlyingDataInStream {
    public static void main(String[] args) {
//        countCat();

        threeDigitCalculate(Optional.of(456));
    }

    private static void countCat() {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");

        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());
        //Todo please remember that
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        // it's RuntimeException
        System.out.println(stream.count());
    }

    private static void threeDigitCalculate(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }


        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
}
