package oca.chapter5;

public class MyException extends Exception {
    void someMethod() {
        doStuff();
    }

    void doStuff() {
        try {
            throw new MyException();
        } catch (MyException e) {
//            throw e;
        }
    }
}


class MyError {
    public static void main(String[] args) {
        badMethod();
        throw new RuntimeException();
    }

    private static void badMethod() {
        doStf();
    }

    private static void doStf() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            throw e;
        }
    }
}