package ocp.chapter3.ComparatorVsComparable;

import java.util.*;


class SimpleComparator implements Comparator<Squirrel>{
    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        //conscise look of Comparator
        Comparator<Squirrel> comparing = Comparator
                .comparing(Squirrel::getSpecies)
                .thenComparing(Squirrel::getWeight);

        return comparing.compare(s1, s2);
    }

}


public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(String theSpecies) {
        if (theSpecies == null) throw new IllegalArgumentException();
        species = theSpecies;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public static void main(String[] args) {

        Squirrel sq1 = new Squirrel("Sq1");
        sq1.setWeight(4545);
        Squirrel sq2 = new Squirrel("Sq1");
        sq2.setWeight(100);

        List<Squirrel> squirrels = new ArrayList<>();
        squirrels.add(sq1);
        squirrels.add(sq2);


        Collections.sort(squirrels, new MultiFieldComparator());
        System.out.println("squirrels = " + squirrels);

        sq1.setWeight(50);
        Collections.sort(squirrels, new ChainingComparator());
        System.out.println("squirrels = " + squirrels);



        //one mpore comparator
        Squirrel sq21 = new Squirrel("sq2");
        squirrels.add(sq21);
        Collections.sort(squirrels, new SimpleComparator());
        System.out.println("squirrels = " + squirrels);


    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}

class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight() - s2.getWeight();
    }
}

class ChainingComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}


