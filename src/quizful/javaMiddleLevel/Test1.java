package quizful.javaMiddleLevel;

public class Test1 {
    public static int y;

    public static void first(int x) {
        System.out.println("first ");
        y = x;
    }

    public static int second(int z) {
        System.out.println("second ");
        return y = z;
    }

    public static void main(String[] args) {
        int t = 0;
        assert t > 0 : second(7);
//        assert t > 1 : first(8);
        System.out.println("done ");
    }
}
