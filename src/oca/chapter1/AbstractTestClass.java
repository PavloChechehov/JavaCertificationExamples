package oca.chapter1;

public class AbstractTestClass {
    public static void main(String[] args) {

        new B().method();
        new B().methodA();

        //can create object form abstract class if implement all abstract methods
        A a = new A() {
            @Override
            void method() {
                System.out.println("3");
            }

            final int a = 4;

            {
                System.out.println(a);
            }

//             static int b = 2;
            // not allowed here
        };

        a.method();

        new P() {
            int p = 5;

            //can use modifiers final. Access modifiers protected, public, default, private
            void methodP() {
                System.out.println(p);
            }
        }
        //can be like that
        .methodP();
        //but P p = new P() {....}
        // p.methodP() - compilation error


    }
}

abstract class P {
}

abstract class A {
    abstract void method();

    void methodA() {
        System.out.println("1");
    }
}

class B extends A {
    @Override
    void method() {
        System.out.println("2");
    }
}

final class C {

}

//can't extend final class
// class D extends C {}