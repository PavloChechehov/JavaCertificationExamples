package oca.chapter6;

public class CompareIntegerObject {
    public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));



        /*
        Boolean
        Byte
        Character from \u0000 to \u007f (7f is 127 in decimal)
        Short and Integer from –128 to 127
        When == is used to compare a primitive to a wrapper, the wrapper will be unwrapped and the
        comparison will be primitive to primitive.
         */
        Integer i3 = 10;
        Integer i4 = 10;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

    }
}
