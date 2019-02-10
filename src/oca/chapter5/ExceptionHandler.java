package oca.chapter5;

import java.io.IOException;

public class ExceptionHandler {
    public static void main(String[] args) throws IOException {
        new ExceptionHandler().doStuff();
    }

    void doStuff() throws IOException {
        System.out.println("ExceptionHandler.doStuff");
        doMore();
    }

    private void doMore() throws IOException {
        System.out.println("ExceptionHandler.doMore");
//        throw new IOException();
    }
}
