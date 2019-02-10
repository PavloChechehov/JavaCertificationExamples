package ocp.chapter2.correctFunctionalInterface;

import ocp.assestmentTest.Animal;

//TODO Correct Functional Interface
@FunctionalInterface
public interface Sprint {
    public void sprint(Animal animal);
}


interface Run extends Sprint {
}

interface SprintFaster extends Sprint {
    public void sprint(Animal animal);
}

interface Skip extends Sprint {
    public default int getHopCount(Animal kangaroo) {
        return 10;
    }

    public static void skip(int speed) {
    }
}
