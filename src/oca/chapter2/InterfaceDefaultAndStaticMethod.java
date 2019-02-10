package oca.chapter2;

public class InterfaceDefaultAndStaticMethod {
    public static void main(String[] args) {
        Inter1 inter1 = new Class1();
        Inter2 inter2 = new Class1();
        Class1 class1 = new Class1();
//
//        inter1.i1();
//        inter2.i1();
//        class1.i1();

        checkReferenceType(inter1);
        checkReferenceType(inter2);
        checkReferenceType(class1);

    }

    private static void checkReferenceType(Inter1 inter1) {
        inter1.i1();
        System.out.println("inter1.toString() = " + inter1.toString());
    }

//    private static void checkReferenceType(Inter2 inter2) {
//        inter2.i1();
//        System.out.println("inter2.toString() = " + inter2.toString());
//    }

    private static void checkReferenceType(Class1 class1) {
        class1.i1();
        System.out.println("class1.toString() = " + class1.toString());
    }
}

interface Inter1 {
    default void i1() {
        System.out.println("Inter1.i1");
    }

    static void i2() {
        System.out.println("Inter1.i2");
    }
}

interface Inter2 extends Inter1 {
    @Override
    default void i1() {
        System.out.println("Inter2.i1");
    }

    static void i2() {
        System.out.println("Inter2.i2");
    }
}

class Class1 implements Inter2 {
    @Override
    public void i1() {
        System.out.println("Class1.i1");
    }
}

interface Inter3 {
    default void i1() {
        System.out.println("Inter3.i1");
    }
}
