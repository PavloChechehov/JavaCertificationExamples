package ocpTests.bonusTest1;

import java.util.stream.*;

public class DragonBoat {

    private static DragonBoat boat;

    public static void row() { }

    public static void race() {
        boat = new DragonBoat();
        IntStream.range(1, 100).forEach(i -> boat.row());
    }
}
