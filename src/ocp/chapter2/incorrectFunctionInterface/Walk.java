package ocp.chapter2.incorrectFunctionInterface;

import ocp.assestmentTest.Animal;
import ocp.chapter2.correctFunctionalInterface.Sprint;

//TODO Incorrect functional interface
//@FunctionalInterface
public interface Walk {

}

//@FunctionalInterface
interface Dance extends Sprint {
    public void dance(Animal animal);
}

//@FunctionalInterface
interface Crawl {
    public void crawl();

    public int getCount();
}
