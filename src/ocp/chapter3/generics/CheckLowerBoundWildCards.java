package ocp.chapter3.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

public class CheckLowerBoundWildCards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);

        List<? super IOException> exceptions = new ArrayList<Exception>();
        // DOES NOT COMPILE
        //exceptions.add(new Exception());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    private static void addSound(List<? super String> list) {
        list.add("quack");
    }


}


