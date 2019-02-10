package oca.chapter3.selfTest;

public class Literally {
    public static void main(String[] args) {
        int i1 = 1_000;
        int  i2 = 10_00;
        //compiler error
//        int i3 = _10_000;
        int i4 = 0b101010;
        int i5 = 0B10_1010;
        int i6 = 0x2_a;
    }

}
