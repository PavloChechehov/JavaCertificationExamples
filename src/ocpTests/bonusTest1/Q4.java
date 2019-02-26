package ocpTests.bonusTest1;

import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        final byte[] buffer = new byte[100];
        int lengthRead;

        File file = new File("Zoo.csv");
        File file1 = new File("ZooCopy.csv");

        try (InputStream in = new BufferedInputStream(new FileInputStream(file));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(file1))) {


            while ((lengthRead = in.read(buffer)) > 0) {
                out.flush();

                //three method overloading
                out.write(lengthRead);
                out.write(buffer);
                out.write(buffer, lengthRead, lengthRead);
                out.flush();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
