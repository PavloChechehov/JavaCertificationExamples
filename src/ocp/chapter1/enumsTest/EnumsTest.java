package ocp.chapter1.enumsTest;

public class EnumsTest {
    public static void main(String[] args) {
        Season s1 = Season.valueOf("SUMMER");

        //compile error Exception in thread "main" java.lang.IllegalArgumentException:
//        Season s2 = Season.valueOf("summer");

        System.out.println("s1 = " + s1);

        Season summer = Season.SUMMER;
        switch (Season.valueOf("SPRING")) {
            case SPRING:
                System.out.println("weather = " + Season.SPRING);
                break;
            case SUMMER:
                System.out.println("weather = " + Season.SUMMER);
                break;
            default:
                System.out.println("not equals ");
        }

    }
}

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}
