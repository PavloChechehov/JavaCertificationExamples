package ocp.chapter3.generics;

import java.util.List;

class LegacyUnicorns {
    public static void main(String[] args) {
        java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0); // ClassCastException
    }

    private static void addUnicorn(List unicorn) {
        //TODO SHOULD REMEMBER THIS EXAMPLE !!!!
        unicorn.add(new Dragon());
    }
}
