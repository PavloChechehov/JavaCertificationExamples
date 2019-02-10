package oca.chapter4;


class A {}
public class B extends A{
    public static void main(String[] args) {
        A a = new B();
        m2(a);
    }

    private static void m2(A a) {
        if (a instanceof B){
            ((B)a).doStuff();
        }
    }

    public static void doStuff() {
        System.out.println("'a' refer to a B");
    }
}