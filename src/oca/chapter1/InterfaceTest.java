package oca.chapter1;

public class InterfaceTest {
    public static void main(String[] args) {
        CC cc = new CC();
        IA.B b = new IA.B();
        CC.ID id = new CC.ID() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

        };
        cc.funA();
    }
}

abstract interface IA {
    public static class B {
        static int b = 1;
    }

    enum ED {
        ;

        // can use mod static )
        static class CD {
            // can't use static ) or no - can bur if outer class is static
            static int s, b;
        }
    }

    void funA();
}

class CC implements IA {

    //correct
    static interface ID {
    }


    static int a = 3;

    static {
        //can use in method - is invisible
        Integer i = new Integer(234);
    }

    @Override
    public void funA() {
//        System.out.println(i); - compilation error
        System.out.println("CC.funA");


    }

    static void funB() {
        System.out.println(a);
    }
}