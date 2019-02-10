package ocp.chapter3.searchingAndSorting;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit{ int id;}
    static class Duck implements Comparable<Duck> {
        String name;

        public Duck(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Duck o) {
            return this.name.compareTo(o.name);
        }
    }
    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
        Set<Rabbit> rabbit = new TreeSet<>(new Comparator<Rabbit>() {
            @Override
            public int compare(Rabbit o1, Rabbit o2) {
                return o1.id - o2.id;
            }
        });

        // Exception in thread "main" java.lang.ClassCastException: ocp.chapter3.searchingAndSorting.UseTreeSet$Rabbit
        // todo cannot be cast to java.lang.Comparable
        rabbit.add(new Rabbit()); // throws an exception
    }
}
