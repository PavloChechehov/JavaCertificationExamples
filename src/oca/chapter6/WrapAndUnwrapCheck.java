package oca.chapter6;

public class WrapAndUnwrapCheck {
    public static void main(String[] args) {
        Integer x = 567;
        Integer y = x;
        System.out.println(x == y);

        //this
        y++;
        //or this, it's equal!
        int x2 = y.intValue();
        x2++;
        y = new Integer(x2);

        System.out.println(x + " " + y);

        System.out.println(x == y);
    }
}
