package ocpTests.ch8;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.IOException;
import java.io.InputStream;

public class Q23 {
    public static void main(String[] args) throws IOException {
        System.out.println(pullBytes(new ByteInputStream("XYZABC".getBytes(), 1024), 3));
    }

    public static String pullBytes(InputStream is, int count) throws IOException {
        System.out.println("is.markSupported() = " + is.markSupported());
        is.mark(count);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append((char) is.read());
        System.out.println("sb = " + sb);
        is.reset();
        is.skip(1);
        sb.append((char) is.read());
        System.out.println("sb = " + sb);
        return sb.toString();
    }
}
