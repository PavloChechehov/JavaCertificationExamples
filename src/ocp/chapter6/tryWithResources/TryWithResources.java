package ocp.chapter6.tryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
            System.out.println(s.next());
        }
    }

    public void oldApproach(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        //implicit finally block is exists
        //can be without catch and finally
        try (BufferedReader r = Files.newBufferedReader(path1);
             BufferedWriter w = Files.newBufferedWriter(path2)) {
            // protected code
        }

        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }


}
