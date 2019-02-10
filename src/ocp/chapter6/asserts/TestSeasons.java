package ocp.chapter6.asserts;

public class TestSeasons {
    enum Seasons {
        SPRING, FALL, SUMMER;
    }

    public static void main(String[] args) {
//        System.out.println(args.length);
        test(Seasons.SPRING);
    }

    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
//                break;
            case SUMMER:
                System.out.println("Longer hours");
//                break;
            default:
                assert false: "Invalid season";
        }
    }
}
