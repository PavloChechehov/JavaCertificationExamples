package ocp.chapter2;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface FunctionInterface {
    void call();
}

class Main implements FunctionInterface {

    @Override
    public void call() {
        System.out.println("Main.call");
    }

    public static void main(String[] args) {
        new Main().call();
    }
}



