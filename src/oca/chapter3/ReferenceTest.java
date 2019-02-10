package oca.chapter3;

import java.awt.*;

public class ReferenceTest {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(5, 10);
        ReferenceTest referenceTest = new ReferenceTest();
        System.out.println("Before dimension.height  = " + dimension.height);
        referenceTest.modify(dimension);
        System.out.println("After dimension.height  = " + dimension.height);
    }

    private void modify(Dimension dimension) {
        dimension.height++;
        System.out.println("dimension.height = " + dimension.height);

    }
}


