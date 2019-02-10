package oca.chapter3;

public class CallersObjectReference {

    public static void main(String[] args) {
        Foo foo = new Foo();
        doStuff(foo);

        System.out.println("foo.getName() = " + foo.getName());
    }

    private static void doStuff(Foo foo) {
        foo.setName("Pasha");

        //TODO good example, original object won't be changed
        foo = new Foo();
    }


}


class Foo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}