package ocp.chapter3.generics;

public class GenericsInInterface {
}

interface Shippable<T> {
    void ship(T t);
}

class ShippableCrate implements Shippable {
    @Override
    public void ship(Object o) {

    }
}
class ShippableRobot implements Shippable<Robot> {

    @Override
    public void ship(Robot robot) {

    }
}

class Robot {}

class NewShippable<U> implements Shippable<U> {
    @Override
    public void ship(U u) {

    }
}