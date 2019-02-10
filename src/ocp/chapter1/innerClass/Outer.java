package ocp.chapter1.innerClass;

public class Outer {

    private static String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

    public void callInner() {
         Inner i = new Inner();
         i.go();
    }

    public static void main(String[] args) {
        System.out.println(greeting);
        Outer outer = new Outer();
        outer.callInner();

        Inner inner = new Outer().new Inner();
        inner.go();
    }
}
