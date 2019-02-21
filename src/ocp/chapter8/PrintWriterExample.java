package ocp.chapter8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter("zoo.log");
        out.print(5); // PrintWriter method
        out.write(String.valueOf(5)); // Writer method
        out.print(2.0); // PrintWriter method
        out.write(String.valueOf(2.0)); // Writer method
        Animal animal = new Animal();
        out.print(animal); // PrintWriter method
        out.write(animal==null ? "null": animal.toString()); // Writer method
    }

}
