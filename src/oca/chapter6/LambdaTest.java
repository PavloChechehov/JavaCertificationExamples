package oca.chapter6;

import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambda = new LambdaTest();

        //TODO LEGAL LAMBDAS

        lambda.go(x -> 7 < 5);
        lambda.go(x -> {
            return adder(2, 1) > 5;
        });
        lambda.go((LambdaTest x) -> {
            int y = 5;
            return adder(5, 6) > 8;
        });
        lambda.go(x -> {
            int y = 6;
            return adder(6, 7) > 7;
        });

        int a = 5;
        int b = 6;
        lambda.go(x -> {
            return adder(a, b) > 8;
        });

        lambda.go((LambdaTest x) -> adder(a, b) > 13);


        //TODO ILLEGAL LAMBDAS

//        lambda.go(x -> return adder(2, 1) > 5;);
//        lambda.go(LambdaTest x -> adder(2, 3) > 7);
//        lambda.go(() -> adder(2, 4) > 7);
//        lambda.go(x-> {adder(5, 5) > 6;});
//        lambda.go(x->{int y=5; adder(y, 7) > 9;});


    }

    private static int adder(int x, int y) {
        return x + y;
    }

    private void go(Predicate<LambdaTest> predicate) {
        LambdaTest m2 = new LambdaTest();
        System.out.println(predicate.test(m2) ? "ternary true" : "ternary false");
    }
}
