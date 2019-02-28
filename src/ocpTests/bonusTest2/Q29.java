package ocpTests.bonusTest2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q29 {

    public static void main(String[] args) {
        try {
            process();
        } catch (IOException | IllegalArgumentException e) {
            //todo it can be
//        } catch (FileNotFoundException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void process() throws FileNotFoundException, IllegalArgumentException {
        throw new FileNotFoundException();
    }
}
