package ocp.chapter6.tryWithResources;

public class CannotSwimException extends Exception {
    public CannotSwimException() {
        super();
    }
    public CannotSwimException(Exception e) {
        super(e);
    }
    public CannotSwimException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            throw new CannotSwimException("sa");
        }catch (Exception e) {
            e = new RuntimeException();

            e.printStackTrace();
        }
    }
}
