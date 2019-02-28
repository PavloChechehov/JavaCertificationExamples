package ocpTests.bonusTest3;

public class WhichAnimal {
    enum AnimalsInPark {
        SQUIRREL, CHIPMUNK, SPARROW
    }

    public static void main(String[] args) {
        AnimalsInPark a = AnimalsInPark.CHIPMUNK;
        switch (a) {
            case SQUIRREL:
                System.out.print("S");
            case CHIPMUNK:
                System.out.print("C");
            default:
                System.out.print("P");
        }
    }
}
