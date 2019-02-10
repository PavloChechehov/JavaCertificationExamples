package oca.chapter3;

public class StringTest {

    public static void main(String[] args) {
        //example 1
        String x = "Java";
        String y = x;

        System.out.println("before y = " + y);

        x = x + " Bean";


        System.out.println("after changes x = " + x);
        System.out.println("after y = " + y);

        //example 2
        String s = "Fred";
        String t = s;


        t.toUpperCase();

        System.out.println("t = " + t);

    }
}
