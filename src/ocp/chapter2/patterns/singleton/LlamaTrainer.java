package ocp.chapter2.patterns.singleton;

public class LlamaTrainer {
    public static void main(String[] args) {
        new LlamaTrainer().feedLlamas(10);
    }

    public boolean feedLlamas(int numberOfLlamas) {
        int amountNeeded = 5 * numberOfLlamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getHayQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        System.out.println("hayStorage.getHayQuantity() = " + hayStorage.getHayQuantity());
        boolean fed = hayStorage.removeHay(amountNeeded);
        System.out.println("hayStorage.getHayQuantity() = " + hayStorage.getHayQuantity());
        if (fed) System.out.println("Llamas have been fed");
        return fed;
    }
}
