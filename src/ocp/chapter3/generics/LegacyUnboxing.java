package ocp.chapter3.generics;

public class LegacyUnboxing {
    public static void main(String[] args) {
        java.util.List numbers = new java.util.ArrayList();
        numbers.add(5);
        //Todo unboxing from Object to primitive value can't be
        //int result =  numbers.get(0); // DOES NOT COMPILE

        int result = (int) numbers.get(0);
        System.out.println("result = " + result);
    }
}
