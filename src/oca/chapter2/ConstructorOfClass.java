package oca.chapter2;

public class ConstructorOfClass {

    public static void main(String[] args) {

        C2 c2 = new C2(2);

        C3 c3 = new C3();

    }

}

class C1 {
    private int i;


    public C1(int i) {
        System.out.println("before c1.i = " + this.i);
        this.i = i;
        System.out.println("after c1.i = " + this.i);
    }
}

class C2 extends C1 {
    private int i;

    public C2(int i) {
        //compile good
        super(2);
        //without this line - compile error because method super() call
        // be care with this
        // superclass all time should have a default constructor or call through super(...) concrete constructor
        System.out.println("before c2.i = " + this.i);
        this.i = i;
        System.out.println("after c2.i = " + this.i);
    }
}

class C3 {

    public C3() {
        super();
    }

    //this a method
    void C3() {

    }
}
