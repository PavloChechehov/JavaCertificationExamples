package ocpTests.bonusTest1;

public class FruitStore {
    public enum Fruit {
        APPLE("red"), BANANA("yellow"), ORANGE("orange"), PLUM("purple");

        Fruit(String color) {
            this.color = color;
        }

        public String color;
    }

    public static void main(String[] args) {
        Fruit one = Fruit.PLUM;
        System.out.println("a " + one + " is " + one.color);
    }
}
