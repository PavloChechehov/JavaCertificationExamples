package oca.chapter1;

public class EnumsTest {

    enum Tea {
        BLACK, GREEN
    }


    public static void main(String[] args) {

        CoffeeSize cs = CoffeeSize.BIG;
        Coffee coffee = new Coffee();
        coffee.coffeeSize = CoffeeSize.HUGE;
        System.out.println("cs = " + cs);
        for (CoffeeSize coffeeSize : CoffeeSize.values()) {
            System.out.println("cs = " + coffeeSize + ", code = " + coffeeSize.getLideCode());
        }
    }
}


enum CoffeeSize {
    BIG(1),
    HUGE(2),
    OVERWHELMING(3) {
        @Override
        public String getLideCode() {
            return "B";
        }
    };

    CoffeeSize(int i) {
        this.position = i;
    }

    private int position;

    public int getPosition() {
        return position;
    }

    public String getLideCode() {
        return "A";
    }
}

class Coffee {
    CoffeeSize coffeeSize;
}