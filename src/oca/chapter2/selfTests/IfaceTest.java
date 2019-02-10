package oca.chapter2.selfTests;

interface MyInterface {
    default int doStuff() {
        return 42;
    }
}

public class IfaceTest implements MyInterface {
    public static void main(String[] args) {
        new IfaceTest().go();
    }

    private void go() {
        //not compile first
//        System.out.println("iface:"+ super.doStuff());
        System.out.println("iface:" + doStuff());
        System.out.println("iface:" + MyInterface.super.doStuff());
    }

    @Override
    public int doStuff() {
        return 43;
    }
}
