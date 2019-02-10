package oca.chapter5.ex4;

public class MyException {
    public static void main(String[] args) {
        String[] foods = new String[]{"Apple", "Kiwi", "Banana"};
        try {
            checkFood(foods[0]);
        } catch (BadFoodException e) {
            e.printStackTrace();
        }


    }

    private static void checkFood(String foodName) throws BadFoodException {
        throw new BadFoodException();
    }
}

class BadFoodException extends Exception {

}