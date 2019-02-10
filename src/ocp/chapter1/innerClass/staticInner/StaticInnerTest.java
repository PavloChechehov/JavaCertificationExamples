package ocp.chapter1.innerClass.staticInner;

public class StaticInnerTest {

    private static class NestedStaticClass{
        public int i = 0;
        private static int a;
        private final int j = 0;
        private final static int KKK = 12;
    }

    private class Nested {
        private int i = 1;
    }

    public static void main(String[] args) {
        Nested nested = new StaticInnerTest().new Nested();
        System.out.println("nested.i = " + nested.i);

        NestedStaticClass nestedStaticClass = new NestedStaticClass();
        System.out.println("nestedStaticClass = " + nestedStaticClass.i);
    }
}
