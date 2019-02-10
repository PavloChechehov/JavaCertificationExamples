package ocp.chapter2;

public class MultyInheritanceInInterface {
    public static void main(String[] args) {

    }
}

interface CanWalk {

    default void walk() {
        System.out.println("Walking");
    }
}

interface CanRun {

    public default void walk() {
        System.out.println("Walking");
    }

    public abstract void run();
}

interface CanSprint extends CanWalk, CanRun {

    void sprint();

    //without this overwrite method - compiler error
    @Override
    default void walk() {
        System.out.println("something");
    }
}