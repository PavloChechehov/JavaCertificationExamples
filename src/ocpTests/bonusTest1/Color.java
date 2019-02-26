package ocpTests.bonusTest1;

import java.util.List;

public class Color {
    private int hue = 10;

    public class Shade {
        public int hue = Color.this.hue;
    }

    public static void main(String[] args) {
        System.out.println(new Color().new Shade().hue);
//        System.out.println(new Shade().hue);
    }

    public static void m(List<?> list) {
//        list.add(new Integer(1));
    }
}
