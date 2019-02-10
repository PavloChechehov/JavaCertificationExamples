package quizful.javaMiddleLevel;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class; // 1
        genericIntClass = Integer.class;            // 2
        intClass = double.class;                    // 3
//        genericIntClass = double.class;             // 4
    }
}
