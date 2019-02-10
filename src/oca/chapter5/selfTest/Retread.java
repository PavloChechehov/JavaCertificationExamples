package oca.chapter5.selfTest;


class MyException extends Exception {
}

class Tire {
    void doStuff() {
    }
}

public class Retread extends Tire {
    public static void main(String[] args) {
        new Retread().doStuff();
    }

    //    void doStuff() throws MyException{
//        void doStuff () throws RuntimeException{
    void doStuff() throws ArithmeticException {
        System.out.println(7 / 0);
    }

}
