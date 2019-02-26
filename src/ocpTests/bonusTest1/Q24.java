package ocpTests.bonusTest1;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Q24 {
    public static void main(String[] args) {
        DoubleStream ds = DoubleStream.empty();
        OptionalDouble opt = ds.findAny();
        System.out.println(opt.orElse(0));
        System.out.println(opt.orElseGet(() -> 0));
        System.out.println(opt.getAsDouble());
        System.out.println(opt.orElseThrow(RuntimeException::new));


    }
}
