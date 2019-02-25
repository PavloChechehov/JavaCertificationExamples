package ocpTests.ch8;

import java.io.*;

public class Q1 {


    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));

        //correct
        InputStream wrapper = new BufferedInputStream(is);
        InputStream wrapper1 = new ObjectInputStream(is);

        //incorrect
        //low level stream
//        InputStream wrapper2 = new FileInputStream(is);

    }
}
