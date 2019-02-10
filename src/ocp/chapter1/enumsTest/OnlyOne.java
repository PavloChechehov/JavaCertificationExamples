package ocp.chapter1.enumsTest;

public enum OnlyOne {
    ONCE(true), TWO(false);

    private OnlyOne(boolean b) {
        System.out.println("b = " + b);
        System.out.println("Constructing");
    }

    public static void main(String[] args) {
        OnlyOne once = OnlyOne.ONCE;
        OnlyOne two = OnlyOne.ONCE;

    }

}

