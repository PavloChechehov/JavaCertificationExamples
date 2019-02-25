package ocpTests.ch8;

import java.io.*;

public class FileMethodTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Zoo.csv");

        Console console = System.console();
        String color = console.readLine("What is your favorite color? ");
        console.writer().println("Your favorite color is " + color);
        OutputStream os = new ObjectOutputStream(new FileOutputStream(file));
        BufferedOutputStream oos = new BufferedOutputStream(os);


    }

    private static void echo() throws IOException {
        try (FileReader fileReader = new FileReader("ZooCopy.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
