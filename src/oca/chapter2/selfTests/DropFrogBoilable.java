package oca.chapter2.selfTests;

interface FrogBoilable {
    static int m(int i) {
        return (i * 9 / 5 ) + 32;
    }

    default String hop() {
        return "hopping";
    }
}

public class DropFrogBoilable implements FrogBoilable {
    public static void main(String[] args) {
        new DropFrogBoilable().go();
    }

    private void go() {
        System.out.println(hop());
//        System.out.println(m(100));
        System.out.println(FrogBoilable.m(100));
        DropFrogBoilable dfb = new DropFrogBoilable();
//        System.out.println(dfb.m(100));
    }
}
