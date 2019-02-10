package ocp.chapter3.generics;

import java.util.ArrayList;

public class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }

    public static <T> void sink(T t) { }
    public static <T> T identity(T t) { return t; }
    //public static T noGood(T t) { return t; } // DOES NOT COMPILE
}


class Elephant {
}

class GenericType {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
    }
}
