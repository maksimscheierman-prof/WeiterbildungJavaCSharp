package A15_Webemaschine;

public class Main {
    public static void main(String[] args) {
        try {
            Shop s = new Shop();
            s.run();
        } finally {
            System.out.println("Test");
        }
    }
}
