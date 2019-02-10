package ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
//        Todo dont compile ? interesting situation
//        list.add(new Integer(54));
        total(list);

        List<Flyer> flyers = new ArrayList<>();
        flyers.add(new HangGlider());
        anyFlyer(flyers);

        List<Flyer> flyers1 = new ArrayList<>();
        flyers1.add(new Goose());
        groupOfFlyers(flyers1);



    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list)
            count += number.longValue();
        System.out.println("count = " + count);
        return count;
    }

    private static void anyFlyer(List<Flyer> flyer) {
        for (Flyer f : flyer) {
            System.out.println(f);
        }
    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) {

        for (Flyer f: flyer) {
            System.out.println("f = " + f);
        }

    }
}


interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
    }
}

class Goose implements Flyer {
    public void fly() {
    }
}

