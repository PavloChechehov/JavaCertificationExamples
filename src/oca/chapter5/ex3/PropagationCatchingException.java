package oca.chapter5.ex3;

public class PropagationCatchingException {
    public static void main(String[] args) {

        System.out.println(reverse("Pasha"));

    }

    static String reverse(String s){
        if (s.length() == 0) throw new IllegalArgumentException();

        String reverseStr = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverseStr += s.charAt(i);
        }

        return reverseStr;
    }
}
